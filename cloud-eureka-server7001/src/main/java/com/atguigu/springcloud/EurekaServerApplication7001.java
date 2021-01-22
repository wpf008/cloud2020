package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午3:25
 * Description: No Description
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7001.class, args);
    }
}
