package com.career.springcore.autowire;

import java.util.List;

public class UserController {

    private UserService userService;

    public List<String> search(String str){
        return userService.search(str);
    }
}
