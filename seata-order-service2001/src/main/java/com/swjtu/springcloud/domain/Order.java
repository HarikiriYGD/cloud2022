package com.swjtu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/7 17:02
 * @Description: 订单实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {


    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    /**
     * 订单状态：0： 创建中；1：已完成
     */
    private Integer status;

}
