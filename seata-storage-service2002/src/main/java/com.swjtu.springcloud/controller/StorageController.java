package com.swjtu.springcloud.controller;

import com.swjtu.springcloud.domain.CommonResult;
import com.swjtu.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 15:09
 * @Description: 视图层操作类
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }

}
