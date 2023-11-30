package com.career.springcore.autowire;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public List<String> search(String str){
        return userService.search(str);
    }

}
