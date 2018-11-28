package com.dubbo.api.domain.dto;

import java.io.Serializable;

/**
 * @author: Lucifer
 * @date: 2018/11/19 21:26
 * @description:
 */
public class PageDTO implements Serializable {

    private Integer start;

    private Integer size;

    public PageDTO() {
    }

    public PageDTO(Integer start, Integer size) {
        this.start = start;
        this.size = size;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PageDTO{" +
                "start=" + start +
                ", size=" + size +
                '}';
    }
}
