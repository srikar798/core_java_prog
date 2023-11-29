package com.career.springcore.autowire;

import org.springframework.util.Assert;

import java.util.List;

public class UserService {


    private UserDao userDao;

    List<String>  search(String str){
        Assert.notNull(str,"Search string should not be null");
        return userDao.search(str);
    }
}
