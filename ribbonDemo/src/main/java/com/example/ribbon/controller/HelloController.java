package com.example.ribbon.controller;

import com.example.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @patthName: HelloController
 * @author: ZhangWei
 */
@RestController
@RequestMapping("/helloCon")
public class HelloController {

    HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/testMain")
    public String testMain(@RequestParam("str") String str) {
        return helloService.testHello(str);
    }

}
