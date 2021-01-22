package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午2:45
 * Description: No Description
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    @Select("select * from payment where id   = #{id}")
    Payment getById(Long id);

}
