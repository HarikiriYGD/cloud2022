package com.swjtu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/30 17:45
 * @Description:
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        // 定义为随机算法
        return new RandomRule();
    }
}
