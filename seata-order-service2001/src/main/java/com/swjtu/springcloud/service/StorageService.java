package com.swjtu.springcloud.service;

import com.swjtu.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/7 17:49
 * @Description: 库存业务类
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /**
     * 远程调用
     * @param productId
     * @param count
     * @return
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
