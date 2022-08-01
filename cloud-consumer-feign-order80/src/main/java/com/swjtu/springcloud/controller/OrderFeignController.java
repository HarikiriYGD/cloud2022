package com.swjtu.springcloud.controller;

import com.swjtu.springcloud.entities.CommonResult;
import com.swjtu.springcloud.entities.Payment;
import com.swjtu.springcloud.service.PaymentFeignService;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/30 21:13
 * @Description:
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // openFeign-->ribbon 客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }

}
