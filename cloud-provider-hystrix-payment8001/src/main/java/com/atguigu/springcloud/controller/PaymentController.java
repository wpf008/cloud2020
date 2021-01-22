package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * User: Wang Pengfei
 * Date: 2021/1/22
 * Time: 下午2:38
 * Description: No Description
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @GetMapping("/payment/hystrix/ok")
    public String payment_ok() {
        return paymentService.payment_ok();
    }

    @GetMapping("/payment/hystrix/failed")
    public String payment_failed() {
        return paymentService.payment_failed();
    }
}
