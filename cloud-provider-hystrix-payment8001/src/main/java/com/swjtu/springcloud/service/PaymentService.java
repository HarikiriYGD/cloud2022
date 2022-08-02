package com.swjtu.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/31 12:49
 * @Description:
 */
public interface PaymentService {

    /**
     * 正常访问，ok
     * @param id
     * @return
     */
    String paymentInfo_OK(Integer id);

    /**
     * 出现异常
     * @param id
     * @return
     */
    String paymentInfo_Timeout(Integer id);

    /**
     * 测试服务熔断的功能
     * @param id
     * @return
     */
    String paymentCircuitBreaker(@PathVariable("id") Integer id);

}
