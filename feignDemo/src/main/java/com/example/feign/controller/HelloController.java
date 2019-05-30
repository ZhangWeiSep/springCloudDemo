package com.example.feign.controller;

import com.example.feign.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @patthName: HelloController
 * @author: ZhangWei
 */
@RestController
@RequestMapping("/helloConFeign")
public class HelloController {

    HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/testHelloFeign")
    public String testHelloFeign(@RequestParam("str") String str) {
        return helloService.helloTest(str);
    }

}
