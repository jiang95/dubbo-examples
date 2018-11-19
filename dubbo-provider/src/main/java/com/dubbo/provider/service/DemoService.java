package com.dubbo.provider.service;

import com.dubbo.provider.domain.DO.UserDO;
import com.dubbo.provider.domain.dto.PageDTO;

import java.util.List;

/**
 * @author: Lucifer
 * @date: 2018/11/19 21:01
 * @description:
 */
public interface DemoService {

    /**
     * 分页查询用户信息
     */
    List<UserDO> findUserList(PageDTO pageDTO);
}
