package com.swjtu.springcloud.service;


import com.swjtu.springcloud.entities.CommonResult;
import com.swjtu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: Lil_boat
 * @Date: 20:18 2022/8/6
 * @Description:
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
