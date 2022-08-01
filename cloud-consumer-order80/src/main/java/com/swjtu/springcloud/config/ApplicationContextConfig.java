package com.swjtu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/28 17:26
 * @Description: 全局配置类 --> applicationContext.xml
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
     * @return
     */
    @Bean
    // @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }





}
