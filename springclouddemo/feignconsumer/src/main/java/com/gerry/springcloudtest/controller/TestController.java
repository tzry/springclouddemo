package com.gerry.springcloudtest.controller;

import com.gerry.springcloudtest.feignservice.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    CalculateService calculateService;

    @RequestMapping(value = "/test/add",method = RequestMethod.GET)
    public int add(int a,int b){
        return calculateService.add(a,b);
    }
}
