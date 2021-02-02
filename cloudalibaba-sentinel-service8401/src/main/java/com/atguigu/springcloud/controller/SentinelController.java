package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Wang Pengfei
 * Date: 2021/2/2
 * Time: 上午10:29
 * Description: No Description
 */
@RestController
public class SentinelController {


    @GetMapping("/testA")
    public String testA() {
        return "testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "testB";
    }
}
