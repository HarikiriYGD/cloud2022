package com.swjtu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Lil_boat
 * @Date: 14:08 2022/8/2
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8803
{
    public static void main(String[] args)
    {
        SpringApplication.run(StreamMQMain8803.class,args);
    }
}
