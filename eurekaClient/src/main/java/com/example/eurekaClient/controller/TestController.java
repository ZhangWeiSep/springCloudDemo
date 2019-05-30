package com.example.eurekaClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @patthName: TestController
 * @author: ZhangWei
 */
@RestController
@RequestMapping("/testCon")
public class TestController {

    @GetMapping("/testMain")
    public String testMain(@RequestParam("str") String str) {
        return "eurekaClient----------" + str;
    }

}
