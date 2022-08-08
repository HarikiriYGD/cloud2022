package com.swjtu.springcloud.controller;

import com.swjtu.springcloud.domain.CommonResult;
import com.swjtu.springcloud.domain.Order;
import com.swjtu.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/7 17:07
 * @Description: 这是订单的controller层
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }

}
