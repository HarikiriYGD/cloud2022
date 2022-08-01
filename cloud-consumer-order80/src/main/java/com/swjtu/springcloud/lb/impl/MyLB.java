package com.swjtu.springcloud.lb.impl;

import com.swjtu.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/30 18:21
 * @Description: 获取服务器的实例
 * 注册扫描
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
            // 自旋比较
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("****next:" + next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        // 获取当前的服务器下标
        int index = getAndIncrement() % serviceInstances.size();
        // 返回服务器
        return serviceInstances.get(index);
    }
}
