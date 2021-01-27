package com.atguigu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Wang Pengfei
 * Date: 2021/1/26
 * Time: 下午5:36
 * Description: No Description
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${name}")
    private String name;

    @GetMapping("/get")
    public String get() {
        return "config: " + name;
    }
}
