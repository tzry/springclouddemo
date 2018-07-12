package com.gerry.springcloudTest.zipkinTestConsumer.controller;

import com.gerry.springcloudTest.zipkinTestConsumer.feignservice.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ProducerService calculateService;

    @RequestMapping(value = "/test/add",method = RequestMethod.GET)
    public int add(int a,int b){
        return calculateService.add(a,b);
    }
}
