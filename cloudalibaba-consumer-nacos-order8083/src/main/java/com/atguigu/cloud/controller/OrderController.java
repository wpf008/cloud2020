package com.atguigu.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * User: Wang Pengfei
 * Date: 2021/1/26
 * Time: 下午3:27
 * Description: No Description
 */
@RestController
public class OrderController {


    private static String url = "http://nacos-payment-provider/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String get() {
        String url_get = url + "get";
        System.out.println(url_get);
        return restTemplate.getForObject(url_get, String.class);
    }
}
