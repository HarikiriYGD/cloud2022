package com.swjtu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/6 16:11
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain9004 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9004.class, args);
    }

}
