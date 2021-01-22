package com.atguigu.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * User: Wang Pengfei
 * Date: 2021/1/20
 * Time: 下午4:11
 * Description: No Description
 */
//@Configuration
public class MySelfRule {
    @Bean
    public IRule getRule() {
        return new RandomRule();
    }
}
