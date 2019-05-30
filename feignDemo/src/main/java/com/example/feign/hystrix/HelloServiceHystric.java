package com.example.feign.hystrix;

import com.example.feign.service.HelloService;
import org.springframework.context.annotation.Configuration;

/**
 * 熔断实现类
 * @author ZhangWei
 * @datetime 2019/5/30 15:15
 */
@Configuration
public class HelloServiceHystric implements HelloService {

    /**
     * 对helloTest实现熔断
     * @param str
     * @return
     */
    @Override
    public String helloTest(String str) {
        return "sorry,error------feign----------" + str;
    }

}
