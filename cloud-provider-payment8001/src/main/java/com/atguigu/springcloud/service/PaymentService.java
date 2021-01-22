package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午2:47
 * Description: No Description
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getById(Long id);
}
