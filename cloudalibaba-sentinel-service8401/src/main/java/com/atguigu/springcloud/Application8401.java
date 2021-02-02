package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: Wang Pengfei
 * Date: 2021/2/2
 * Time: 上午10:28
 * Description: No Description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application8401 {

    public static void main(String[] args) {
        SpringApplication.run(Application8401.class, args);
    }
}
