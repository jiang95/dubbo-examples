package com.dubbo.provider.service.impl;

import com.dubbo.provider.domain.DO.UserDO;
import com.dubbo.provider.domain.dto.PageDTO;
import com.dubbo.provider.persist.UserMapper;
import com.dubbo.provider.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Lucifer
 * @date: 2018/11/19 21:01
 * @description:
 */
public class DemoServiceImpl implements DemoService {

    @Resource
    private UserMapper userMapper;


    @Override
    public List<UserDO> findUserList(PageDTO pageDTO) {
        return userMapper.selectByPage(pageDTO);
    }
}
