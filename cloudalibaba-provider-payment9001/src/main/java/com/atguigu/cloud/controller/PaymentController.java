package com.atguigu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Wang Pengfei
 * Date: 2021/1/26
 * Time: 下午3:30
 * Description: No Description
 */
@RestController
public class PaymentController {


    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String get() {
        return "current port is " + port;
    }
}
