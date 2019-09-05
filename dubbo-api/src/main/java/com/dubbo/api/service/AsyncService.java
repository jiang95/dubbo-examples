package com.dubbo.api.service;

import java.util.concurrent.CompletableFuture;

/**
 * @author: lingjun.jlj
 * @date: 2019/9/5 11:31
 * @description: 异步化 Demo
 */
public interface AsyncService {

    String sayHello(String name);

    default CompletableFuture<String> sayHiAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }

    CompletableFuture<String> sayHelloAsync(String name);
}
