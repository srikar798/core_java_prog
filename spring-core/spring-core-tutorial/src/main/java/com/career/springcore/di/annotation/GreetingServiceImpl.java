package com.career.springcore.di.annotation;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String greet(String name) {
        return "Hello " + name + " , Welcome ton Spring ANnotations";
    }
}
