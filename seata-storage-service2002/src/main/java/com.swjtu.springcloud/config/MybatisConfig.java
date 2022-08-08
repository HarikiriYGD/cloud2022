package com.swjtu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 15:11
 * @Description:
 */
@Configuration
@MapperScan(value = {"com.swjtu.springcloud.dao"})
public class MybatisConfig {
}
