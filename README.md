# spring-boot-dubbo

Dubbo项目   

Spring-Boot整合dubbo。使用的是xml配置,同时也是用了注解。 
   
MySQL + mybatis 获取数据，数据池使用durid。在启动项目的时候，请确保本地的
**zookeeper已经启动**。

## Dubbo
- [Dubbo Provider](/dubbo-provider/)：服务提供者，实现API接口
- [Dubbo API](/dubbo-api/README.md)：API 提供者
- [Dubbo Consumer](dubbo-consumer/README.md)：消费者，调用 API 接口

## 参考
- [dubbo官网](http://dubbo.apache.org/)
- [dubbo中文文档](http://dubbo.apache.org/books/dubbo-user-book/)
- [ dubbo 注册中心](http://dubbo.apache.org/books/dubbo-admin-book/)
- [Spring Boot Dubbo](https://github.com/apache/incubator-dubbo-spring-boot-project)
