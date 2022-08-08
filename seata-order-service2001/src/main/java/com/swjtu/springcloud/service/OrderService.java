package com.swjtu.springcloud.service;

import com.swjtu.springcloud.domain.Order;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/7 17:07
 * @Description:
 */
public interface OrderService {

    /**
     * 新建订单
     * @param order
     * @return
     */
    void create(Order order);

}
