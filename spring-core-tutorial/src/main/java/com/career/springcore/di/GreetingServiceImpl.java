package com.career.springcore.di;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String greet(String name) {
        return "Hello " + name + " , Welcome ton Spring Core";
    }
}
