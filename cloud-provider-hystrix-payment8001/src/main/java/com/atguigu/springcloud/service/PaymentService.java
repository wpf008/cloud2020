package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * User: Wang Pengfei
 * Date: 2021/1/22
 * Time: 下午2:14
 * Description: No Description
 */
@Service
public class PaymentService {


    public String payment_ok() {
        return "payment_ok";
    }

    @HystrixCommand(fallbackMethod = "payment_fallback",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="1000")})
    public String payment_failed() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "payment_failed";
    }


    public String payment_fallback() {
        return "payment_fallback";
    }
}
