package com.swjtu.springcloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 15:06
 * @Description:
 */
public interface StorageService {

    /**
     * 库存减少
     * @param productId
     * @param count
     * @return
     */
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
