package com.dubbo.consumer.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: lingjun.jlj
 * @date: 2018/11/20 09:46
 * @description:
 */
@Data
public class ResponseModel<T> implements Serializable {

    private int status;

    private T data;

    private String info;

    private long timeStamp = System.currentTimeMillis();

    public ResponseModel() {
    }

    public ResponseModel(int status, String info) {
        this.status = status;
        this.data = data;
        this.info = info;
    }

    public static <T> ResponseModel<T> Success() {
        return new ResponseModel<>(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getName());
    }
}
