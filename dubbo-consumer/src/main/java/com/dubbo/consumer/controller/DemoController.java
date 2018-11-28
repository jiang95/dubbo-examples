package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.domain.DO.UserDO;
import com.dubbo.api.domain.dto.PageDTO;
import com.dubbo.api.service.DemoService;
import com.dubbo.consumer.utils.ResponseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Lucifer
 * @date: 2018/11/20 09:54
 * @description:
 */
@RestController
@RequestMapping(value = "/demo/")
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping(value = "findUserByPage")
    public ResponseModel findUserByPage(@RequestParam Integer start, @RequestParam Integer size) {
        ResponseModel responseModel = ResponseModel.Success();
        PageDTO pageDTO = new PageDTO(start, size);
        responseModel.setData(demoService.findUserList(pageDTO));
        return responseModel;
    }
}
