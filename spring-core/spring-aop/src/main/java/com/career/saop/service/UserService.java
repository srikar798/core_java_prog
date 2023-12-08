package com.career.saop.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @ConvertToUpper
    public List<String> getUserDetails(){
        return List.of("Krish","Manoj","Charan","Tanvi");
    }
}
