package com.dubbo.api.service;

import com.dubbo.api.domain.DO.UserDO;
import com.dubbo.api.domain.dto.PageDTO;

import java.util.List;

/**
 * @author: Lucifer
 * @date: 2018-11-28 17:56
 * @description:
 */
public interface DemoService {

    List<UserDO> findUserList(PageDTO pageDTO);
}
