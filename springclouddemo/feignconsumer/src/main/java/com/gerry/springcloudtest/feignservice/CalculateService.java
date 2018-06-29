package com.gerry.springcloudtest.feignservice;

import com.gerry.springcloudtest.feignservice.fallback.CalculateServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "PRODUCER1",fallback = CalculateServiceFallBack.class)
public interface CalculateService {
    @RequestMapping(value = "/calculate/add",method = RequestMethod.GET)
    int add(
            @RequestParam(value = "a") int a,
            @RequestParam(value = "b") int b
    );
}
