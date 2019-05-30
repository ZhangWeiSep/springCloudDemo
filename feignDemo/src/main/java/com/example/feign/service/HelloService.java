package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @patthName: HelloService
 * @author: ZhangWei
 */
@FeignClient(value = "EUREKA-CLIENT")
public interface HelloService {

    @GetMapping("/testCon/testMain")
    String helloTest(@RequestParam("str") String str);

}
