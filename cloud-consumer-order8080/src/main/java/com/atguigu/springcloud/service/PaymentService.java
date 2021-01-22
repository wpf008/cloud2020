package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * User: Wang Pengfei
 * Date: 2021/1/20
 * Time: 下午4:16
 * Description: No Description
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentService {

    @PostMapping("payment/create")
    CommonResult create(@RequestBody Payment payment);

    @GetMapping("payment/get/{id}")
    CommonResult get(@PathVariable("id") Long id);
}
