package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: Wang Pengfei
 * Date: 2021/1/26
 * Time: 下午3:00
 * Description: No Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application9001 {

    public static void main(String[] args) {
        SpringApplication.run(Application9001.class, args);
    }
}
