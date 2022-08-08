package com.swjtu.springcloud.service.impl;

import com.swjtu.springcloud.dao.AccountDao;
import com.swjtu.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 15:26
 * @Description:
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------->账户金额减少开始");
        // 模拟超时异常
        try { TimeUnit.SECONDS.sleep(20); } catch (InterruptedException e){ e.printStackTrace(); }
        accountDao.decrease(userId, money);
        log.info("------->账户金额减少结束");
    }
}
