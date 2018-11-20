package com.dubbo.consumer.utils;

/**
 * @author: Lucifer
 * @date: 2018/11/20 09:50
 * @description:
 */
public enum ResponseCodeEnum {

    SUCCSES(200, "Success");

    private Integer code;

    private String text;

    ResponseCodeEnum(Integer code, String text) {
        this.code = code;
        this.text = text;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
