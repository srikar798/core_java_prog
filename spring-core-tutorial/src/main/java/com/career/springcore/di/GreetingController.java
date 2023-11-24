package com.career.springcore.di;

public class GreetingController {

    private GreetingService greetingService = new GreetingService() {
    };

    public String greet(String name){
        if(name == null || name.isEmpty()){
            name = "User";
        }
        return greetingService.greet(name);
    }
}
