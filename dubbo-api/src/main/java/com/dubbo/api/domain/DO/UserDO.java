package com.dubbo.api.domain.DO;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: lingjun.jlj
 * @date: 2018/11/19 21:23
 * @description:
 */
@Data
public class UserDO implements Serializable {

    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String card;
    private String phone;
    private Integer status;
    private Date createTime;
    private Date updateTime;


}
