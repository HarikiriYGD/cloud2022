package com.swjtu.springcloud.service;

import com.swjtu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/30 14:15
 * @Description:
 */
public interface PaymentService {
    /**
     * 创建一条记录
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id查询支付订单
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
