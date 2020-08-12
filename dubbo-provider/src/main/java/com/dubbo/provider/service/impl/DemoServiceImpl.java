package com.dubbo.provider.service.impl;

import com.dubbo.api.domain.DO.UserDO;
import com.dubbo.api.domain.dto.PageDTO;
import com.dubbo.api.service.DemoService;
import com.dubbo.provider.persist.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lingjun.jlj
 * @date: 2018/11/19 21:01
 * @description:
 */
@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Resource
    private UserMapper userMapper;


    @Override
    public List<UserDO> findUserList(PageDTO pageDTO) {
        return userMapper.selectByPage(pageDTO);
    }
}
