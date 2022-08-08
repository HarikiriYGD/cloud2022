package com.swjtu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.swjtu.springcloud.entities.CommonResult;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/6 15:39
 * @Description: sentinel自定义限流处理器
 */
public class    CustomerBlockHandler  {

    public static CommonResult handlerException1(BlockException e) {
        return new CommonResult(444, "按客户自定义的，global handler1");
    }

    public static CommonResult handlerException2(BlockException e) {
        return new CommonResult(444, "按客户自定义的，global handler2");
    }

}
