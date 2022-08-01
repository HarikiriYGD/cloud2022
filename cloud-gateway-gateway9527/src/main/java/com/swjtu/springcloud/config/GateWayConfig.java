package com.swjtu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/31 17:28
 * @Description:
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_ygd1",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        routes.route("path_route_ygd2",
                r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();

        return routes.build();
    }

}
