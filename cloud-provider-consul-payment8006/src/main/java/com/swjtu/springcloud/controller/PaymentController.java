package com.swjtu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/30 16:02
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentConsul() {
        return "springCloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
