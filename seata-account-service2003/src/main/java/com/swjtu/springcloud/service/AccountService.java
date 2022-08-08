package com.swjtu.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 15:25
 * @Description:
 */
public interface AccountService {

    /**
     * 账户用户金额操作类
     * @param userId
     * @param money
     * @return
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
