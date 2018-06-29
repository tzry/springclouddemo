package com.gerry.springcloudtest.feignservice.fallback;

import com.gerry.springcloudtest.feignservice.CalculateService;
import org.springframework.stereotype.Component;

@Component
public class CalculateServiceFallBack implements CalculateService {

    @Override
    public int add(int a, int b) {
        throw new RuntimeException("CalculateService.add fallback");
    }
}
