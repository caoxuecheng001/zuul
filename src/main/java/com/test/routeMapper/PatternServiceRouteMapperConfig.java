package com.test.routeMapper;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;

/**
 * @ClassName : PartternServiceRouteMapperConfig
 * @Description :
 * @Author : caoxuecheng
 * @Date: 2021-03-01 16:58
 */

public class PatternServiceRouteMapperConfig {

    //    @Bean
    public PatternServiceRouteMapper patternServiceRouteMapper() {

        /*
         * servicePattern 指定微服务的正则
         * routePattern  指定路由正则
         * */
        return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }
}
