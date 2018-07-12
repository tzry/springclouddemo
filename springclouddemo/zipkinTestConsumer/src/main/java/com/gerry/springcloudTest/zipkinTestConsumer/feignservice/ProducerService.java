package com.gerry.springcloudTest.zipkinTestConsumer.feignservice;

import com.gerry.springcloudTest.zipkinTestConsumer.feignservice.fallback.ProducerServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ZIPKIN-PRODUCER1",fallback = ProducerServiceFallBack.class)
public interface ProducerService {
    @RequestMapping(value = "/calculate/add",method = RequestMethod.GET)
    int add(
            @RequestParam(value = "a") int a,
            @RequestParam(value = "b") int b
    );
}
