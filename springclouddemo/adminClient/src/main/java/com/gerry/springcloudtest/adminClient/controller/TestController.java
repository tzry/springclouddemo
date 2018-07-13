package com.gerry.springcloudtest.adminClient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public Integer test(){
        return 1;
    }
}
