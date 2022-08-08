package com.swjtu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 14:54
 * @Description: 库存持久层操作
 */
@Mapper
public interface StorageDao {

    /**
     * 库存减少
     * @param productId
     * @param count
     * @return
     */
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
