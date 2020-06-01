package com.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: lingjun.jlj
 * @desciption: dubbo provider 服务
 */
@EnableDubbo
@SpringBootApplication
@MapperScan("com.dubbo.provider.persist")
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
