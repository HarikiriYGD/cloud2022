package com.swjtu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/2 21:13
 * @Description:
 */
@Configuration
public class ApplicationContextBean {

    /**
     * @LoadBalanced: Ribbon实现负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
