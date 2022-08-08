package com.swjtu.springcloud.service.impl;

import com.swjtu.springcloud.domain.Order;
import com.swjtu.springcloud.mapper.OrderMapper;
import com.swjtu.springcloud.service.AccountService;
import com.swjtu.springcloud.service.OrderService;
import com.swjtu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/7 17:08
 * @Description: 业务层调dao
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Override
    public void create(Order order) {
        log.info("---->开始新建订单");
        int result = orderMapper.create(order);
        log.info("---->订单微服务开始调用库存，做扣减Count");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("---->订单微服务开始调用库存，做扣减---->结束");

        log.info("---->订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("---->订单微服务开始调用账户，做扣减Money---->结束");

        log.info("---->修改订单状态开始");
        orderMapper.update(order.getUserId(), 0);
        log.info("---->修改订单状态结束");

        log.info("---->下订单结束了，O(∩_∩)O哈哈~" + result);
    }


}
