package com.example.rurekaclientribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * EnableEurekaClient: 启动eureka服务注册中心，声明这是一个eureka客户端
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaclientribbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientribbonApplication.class, args);
    }

}
