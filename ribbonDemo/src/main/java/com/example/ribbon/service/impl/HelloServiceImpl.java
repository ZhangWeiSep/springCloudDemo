package com.example.ribbon.service.impl;

import com.example.ribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @patthName: HelloServiceImpl
 * @author: ZhangWei
 */
@Service
public class HelloServiceImpl implements HelloService {

    private RestTemplate restTemplate;

    private final String EUREKACLIENT = "http://EUREKA-CLIENT";

    @Autowired
    public HelloServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 测试ribbon + rest 服务调用方式
     * HystrixCommand: 熔断器，指定在服务提供者无法访问的情况下快速执行失败方法
     *                  fallbackMethod：服务调用失败执行的方法
     * @param str
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "helloError")
    public String testHello(String str) {
        return restTemplate.getForEntity(EUREKACLIENT + "/testCon/testMain?str=" + str, String.class).getBody();
    }

    /**
     * 熔断器触发后执行的方法
     * @param str
     * @return
     */
    public String helloError(String str) {
        return "sorry,error--------------" + str;
    }

}
