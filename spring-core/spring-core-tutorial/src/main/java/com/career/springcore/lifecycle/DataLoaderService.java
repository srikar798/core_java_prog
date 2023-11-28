package com.career.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DataLoaderService {

    private List<String> userNames;


    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroy method called");
        if(userNames != null){
            userNames.clear();
        }
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("After properties set method called");
        userNames = List.of("Krish","Manoj","Charan","Tanvi");
        System.out.println("User names are :"+userNames);
    }
}
