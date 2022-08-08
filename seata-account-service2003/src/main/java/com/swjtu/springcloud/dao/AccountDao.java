package com.swjtu.springcloud.dao;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 15:17
 * @Description: 账户的持久层操作
 */
@Mapper
public interface AccountDao {

    /**
     * 账户的金额操作
     * @param userId
     * @param money
     * @return
     */
    int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
