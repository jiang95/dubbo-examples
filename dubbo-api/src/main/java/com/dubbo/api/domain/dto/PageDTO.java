package com.dubbo.api.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: lingjun.jlj
 * @date: 2018/11/19 21:26
 * @description:
 */
@Data
public class PageDTO implements Serializable {

    private Integer start;

    private Integer size;

    public PageDTO() {
    }

    public PageDTO(Integer start, Integer size) {
        this.start = start;
        this.size = size;
    }
}
