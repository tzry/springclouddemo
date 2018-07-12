package com.gerry.springcloudTest.zipkinTestConsumer.feignservice.fallback;

import com.gerry.springcloudTest.zipkinTestConsumer.feignservice.ProducerService;
import org.springframework.stereotype.Component;

@Component
public class ProducerServiceFallBack implements ProducerService {

    @Override
    public int add(int a, int b) {
        throw new RuntimeException("CalculateService.add fallback");
    }
}
