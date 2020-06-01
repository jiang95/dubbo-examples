package com.dubbo.provider.persist;

import com.dubbo.api.domain.DO.UserDO;
import com.dubbo.api.domain.dto.PageDTO;

import java.util.List;

/**
 * @author: lingjun.jlj
 * @date: 2018/11/19 21:20
 * @description:
 */
public interface UserMapper {

    void addUser(UserDO user);

    void update(UserDO userDO);

    List<UserDO> selectUser();

    List<UserDO> selectByPage(PageDTO pageDTO);
}
