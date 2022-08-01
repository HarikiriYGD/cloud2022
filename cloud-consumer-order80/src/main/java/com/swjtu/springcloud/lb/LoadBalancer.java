package com.swjtu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/30 18:18
 * @Description:
 */
public interface LoadBalancer {

    /**
     * 所有服务的list集合
     * @param serviceInstances
     * @return
     */
    ServiceInstance instance(List<ServiceInstance> serviceInstances);


}
