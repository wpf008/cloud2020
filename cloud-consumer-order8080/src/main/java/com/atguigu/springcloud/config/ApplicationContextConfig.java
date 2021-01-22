package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午3:15
 * Description: No Description
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
