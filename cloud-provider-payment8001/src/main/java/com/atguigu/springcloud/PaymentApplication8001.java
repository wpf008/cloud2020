package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午2:06
 * Description: No Description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class, args);
    }
}
