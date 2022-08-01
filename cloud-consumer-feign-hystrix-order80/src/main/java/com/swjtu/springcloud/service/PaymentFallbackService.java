package com.swjtu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/31 14:15
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentFallbackService fall back ---> paymentInfo_OK, (ಥ﹏ಥ)";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-------PaymentFallbackService fall back ---> paymentInfo_Timeout, (ಥ﹏ಥ)";
    }
}
