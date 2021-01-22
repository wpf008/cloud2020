package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * User: Wang Pengfei
 * Date: 2021/1/22
 * Time: 下午3:44
 * Description: No Description
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok")
    String payment_ok();

    @GetMapping("/payment/hystrix/failed")
    String payment_failed();

}
