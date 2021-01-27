package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: Wang Pengfei
 * Date: 2021/1/26
 * Time: 下午5:04
 * Description: No Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application3377 {
    public static void main(String[] args) {
        SpringApplication.run(Application3377.class, args);
    }
}
