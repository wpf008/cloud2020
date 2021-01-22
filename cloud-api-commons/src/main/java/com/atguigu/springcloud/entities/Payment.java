package com.atguigu.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午2:09
 * Description: No Description
 */
@Data
public class Payment implements Serializable {
   private Long id;

   private String serial;
}
