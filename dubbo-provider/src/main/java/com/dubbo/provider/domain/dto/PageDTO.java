package com.dubbo.provider.domain.dto;

/**
 * @author: Lucifer
 * @date: 2018/11/19 21:26
 * @description:
 */
public class PageDTO {

    private Integer start;

    private Integer size;

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
