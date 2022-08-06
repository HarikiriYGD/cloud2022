package com.swjtu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/6 13:00
 * @Description:
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "------->testA";
    }

    @GetMapping("/testB")
    public String testB() {
        // 排队等待
        // log.info(Thread.currentThread().getName() + "\t" + "testB");
        return "------->testB";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "------testHotKey";
    }

    /**
     * 善后方法
     *
     * @param p1
     * @param p2
     * @param e
     * @return
     */
    public String deal_testHotKey(String p1, String p2, BlockException e) {
        return "deal_testHotKey----难过(ಥ﹏ಥ)";
    }

}
