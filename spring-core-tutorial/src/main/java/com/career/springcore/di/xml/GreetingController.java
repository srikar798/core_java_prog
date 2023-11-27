package com.career.springcore.di.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@lombok.Getter

public class GreetingController {

    private GreetingService greetingService;

    public String greet(String name){
        if(name == null || name.isEmpty()){
            name = "User";
        }
        return greetingService.greet(name);
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
