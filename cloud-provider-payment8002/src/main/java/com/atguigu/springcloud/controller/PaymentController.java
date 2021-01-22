package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午2:48
 * Description: No Description
 */
@RestController
@RequestMapping("payment")
@Log4j2
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        return CommonResult.success(paymentService.create(payment));
    }

    @GetMapping("/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) throws InterruptedException {
        log.info("当前服务端口:{}",port);
        return CommonResult.success(port,paymentService.getById(id));
    }
}
