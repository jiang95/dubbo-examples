package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.consumer.utils.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Lucifer
 * @date: 2018/11/20 09:54
 * @description:
 */
@RestController
@RequestMapping(value = "/demo/")
public class DemoController {

    @Autowired
    private DemoService demoService;



    @GetMapping(value = "findUserByPage")
    public ResponseModel findUserByPage(@RequestParam Integer start, @RequestParam Integer size){
        ResponseModel responseModel = ResponseModel.Success();
        responseModel.setData();
        return responseModel;
    }
}
