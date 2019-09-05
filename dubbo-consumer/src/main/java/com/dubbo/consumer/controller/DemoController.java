package com.dubbo.consumer.controller;

import com.dubbo.api.domain.dto.PageDTO;
import com.dubbo.api.service.AsyncService;
import com.dubbo.api.service.DemoService;
import com.dubbo.consumer.utils.ResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

/**
 * @author: Lucifer
 * @date: 2018/11/20 09:54
 * @description:
 */
@Slf4j
@RestController
@RequestMapping(value = "/demo/")
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;
    @Reference(version = "1.0.0")
    private AsyncService asyncService;

    @GetMapping(value = "findUserByPage")
    public ResponseModel findUserByPage(@RequestParam Integer start, @RequestParam Integer size) {
        ResponseModel responseModel = ResponseModel.Success();
        PageDTO pageDTO = new PageDTO(start, size);
        responseModel.setData(demoService.findUserList(pageDTO));
        return responseModel;
    }

    @GetMapping(value = "async/{name}")
    public ResponseModel findUserByPage(@PathVariable("name") String name) throws Exception {
        ResponseModel responseModel = ResponseModel.Success();
        log.info("异步获取数据");
        Long startTime = System.currentTimeMillis();
        CompletableFuture<String> future = asyncService.sayHiAsync(name);
        responseModel.setData(future.get());
        Long endTime = System.currentTimeMillis();
        log.info("异步获取数据接口获取数据耗时：{} ms", (endTime - startTime));
        return responseModel;
    }
}
