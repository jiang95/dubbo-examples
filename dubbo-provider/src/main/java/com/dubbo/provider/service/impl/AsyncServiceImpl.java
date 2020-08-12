package com.dubbo.provider.service.impl;

import com.dubbo.api.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

import java.util.concurrent.CompletableFuture;

/**
 * @author: lingjun.jlj
 * @date: 2019/9/5 11:34
 * @description:
 */
@Slf4j
@DubboService(version = "1.0.0")
public class AsyncServiceImpl implements AsyncService {


    @Override
    public String sayHello(String name) {
        log.info("provider received: {}", name);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("provider returned.");
        return "Hello " + name + ", today is fine";
    }

    @Override
    public CompletableFuture<String> sayHelloAsync(String name) {
        RpcContext savedContext = RpcContext.getContext();
        RpcContext savedServerContext = RpcContext.getServerContext();
        return CompletableFuture.supplyAsync(() -> {
            String received = savedContext.getAttachment("consumer-key1");
            log.info("consumer-key1 from attachment: " + received);
            savedServerContext.setAttachment("server-key1", "server-" + received);

            received = savedContext.getAttachment("filters");
            log.info("filters from attachment: " + received);
            savedServerContext.setAttachment("filters", received);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "async response from provider.";
        });
    }
}
