package com.swjtu.springcloud;

import com.swjtu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/28 17:20
 * @Description: 订单类的主启动类
 * @EnableEurekaClient: 开启作为eureka的客户端
 * @RibbonClients: 开启Ribbon的定制化
 */
@SpringBootApplication
@EnableEurekaClient
// @RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
