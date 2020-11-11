package com.dubbo.provider.demo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author: lingjun.jlj
 * @date: 2020/11/11 20:10
 * @description:
 */
@SPI
public interface Robot {

    void sayHello();
}
