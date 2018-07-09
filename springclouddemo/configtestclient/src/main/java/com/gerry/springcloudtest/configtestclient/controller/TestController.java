package com.gerry.springcloudtest.configtestclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${val.test}")
    Integer test;

    @RequestMapping("/test")
    public Integer test(){
        return test;
    }
}
