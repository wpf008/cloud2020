package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentHystrixService;
import com.atguigu.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午3:14
 * Description: No Description
 */
@RestController
public class OrderController {

    //    private final static String PAYMENT_URL = "http://localhost:8001";//不集群
    private final static String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";//集群

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    PaymentService paymentService;

    @Autowired
    PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentService.get(id);
    }

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {

        return paymentService.create(payment);
    }


    @GetMapping("/consumer/payment/ok")
    public String ok() {
        return paymentHystrixService.payment_ok();
    }

    @GetMapping("/consumer/payment/fail")
    @HystrixCommand(fallbackMethod = "payment_fallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    public String failed() {
        return paymentHystrixService.payment_failed();
    }


    public String payment_fallback() {
        return "80 port payment_fallback";
    }


//    @GetMapping("/consumer/payment/get/{id}")
//    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
//        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class, id);
//    }
//
//    @GetMapping("/consumer/payment/create")
//    public CommonResult<Payment> create(Payment payment) {
//        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
//    }
}
