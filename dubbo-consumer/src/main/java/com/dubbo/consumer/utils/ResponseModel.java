package com.dubbo.consumer.utils;

import java.io.Serializable;

/**
 * @author: Lucifer
 * @date: 2018/11/20 09:46
 * @description:
 */
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
        return new ResponseModel<>(ResponseCodeEnum.SUCCSES.getCode(), ResponseCodeEnum.SUCCSES.getText());
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "status=" + status +
                ", data=" + data +
                ", info='" + info + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
