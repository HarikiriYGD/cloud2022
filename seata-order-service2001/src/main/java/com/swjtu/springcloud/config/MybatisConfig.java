package com.swjtu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;



/**
 * @Author: Lil_boat
 * @Date: 2022/8/8 11:44
 * @Description: mybatis的配置文件
 */
@Configuration
@MapperScan({"com.swjtu.springcloud.mapper"})
public class MybatisConfig {

}
