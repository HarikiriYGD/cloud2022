package com.swjtu.springcloud.controller;

import com.swjtu.springcloud.domain.CommonResult;
import com.swjtu.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 15:28
 * @Description:
 */
@RestController
@Slf4j
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(Long userId, BigDecimal money){
        accountService.decrease(userId, money);
        return new CommonResult(200,"金额操作成功");
    }

}
