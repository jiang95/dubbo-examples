package com.dubbo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: Lucifer
 * @desciption: provider 服务
 */
@MapperScan("com.dubbo.provider.persist")
@SpringBootApplication
//@ImportResource(value = "dubbo-provider.xml")
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
