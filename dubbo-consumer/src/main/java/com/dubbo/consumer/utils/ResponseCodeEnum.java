package com.dubbo.consumer.utils;

import lombok.Getter;

/**
 * @author: lingjun.jlj
 * @date: 2018/11/20 09:50
 * @description:
 */
@Getter
public enum ResponseCodeEnum {

    /**
     * 返回成功
     */
    SUCCESS(200, "Success");

    private Integer code;

    private String name;

    ResponseCodeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
