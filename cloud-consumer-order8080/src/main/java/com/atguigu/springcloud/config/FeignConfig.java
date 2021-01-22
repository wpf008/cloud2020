package com.atguigu.springcloud.config;

/**
 * User: Wang Pengfei
 * Date: 2021/1/20
 * Time: 下午5:28
 * Description: No Description
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

