package com.swjtu.springcloud.service.impl;

import com.swjtu.springcloud.dao.StorageDao;
import com.swjtu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 15:06
 * @Description: 业务层操作类
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public int decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        int result = storageDao.decrease(productId, count);
        log.info("------->storage-service中扣减库存结束");
        return result;
    }
}
