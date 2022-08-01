package com.swjtu.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.swjtu.springcloud.service.PaymentService;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/31 12:50
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_OK, id:" + id + "\t" + "^_^";
    }

    /**
     * 上面故意制造两种异常:
     * int age = 10/0，计算异常
     * <p>
     * 我们能接受3秒钟，它运行5秒钟，超时异常。
     * 当前服务不可用了，做服务降级，兜底的方案都是paymentInfo_TimeOutHandler
     *
     * @param id
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_Timeout(Integer id) {
        int timeNumber = 3;
        //  int age = 10 / 0;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_Timeout, id:" + id + "\t" + "^_^" + "耗时" + timeNumber + "秒钟";
    }

    public String paymentInfo_TimeoutHandler(Integer id) {
        return "线程池:   " + Thread.currentThread().getName() + "    系统繁忙，请稍后再试, id:    " + id + "\t" + "  o(╥﹏╥)o  ";
    }

    /**
     * ===============服务熔断
     * circuitBreaker.enabled ---> 是否开启断路器
     * circuitBreaker.requestVolumeThreshold ---> 请求次数
     * circuitBreaker.sleepWindowInMilliseconds ---> 时间窗口期
     * circuitBreaker.errorThresholdPercentage ---> 失败率达到多少后跳闸
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),
    })
    @Override
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("****id不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id) {
        return "id 不能为负数，请稍后再试o(╥﹏╥)o~~~~   id:" + id;
    }


}
