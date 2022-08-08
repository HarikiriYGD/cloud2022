package com.swjtu.springcloud.service;

import com.swjtu.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/7 17:49
 * @Description: 账户远程调用类 使用feign
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    /**
     * 远程调用
     * @param productId
     * @param money
     * @return
     */
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long productId, @RequestParam("money") BigDecimal money);

}
