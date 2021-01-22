package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User: Wang Pengfei
 * Date: 2021/1/18
 * Time: 下午2:11
 * Description: No Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult(200, "success", data);
    }
    public static <T> CommonResult<T> success(String message,T data) {
        return new CommonResult(200, message, data);
    }
}
