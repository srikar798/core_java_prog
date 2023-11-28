package com.career.springcore.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Scope("prototype")
public class UserService {

    public List<String> getUsers(){
        return List.of("Ram","Srikar","Krish","Manoj");
    }
}
