package com.swjtu.springcloud.mapper;

import com.swjtu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/7 17:09
 * @Description: 持久层操作
 */
@Mapper
public interface OrderMapper {

    /**
     * 新建订单
     * @param order
     * @return
     */
    int create(Order order);

    /**
     * 修改订单状态
     * @param userId
     * @param status
     * @return
     */
    int update(@Param("userId") Long userId, @Param("status") Integer status);


}
