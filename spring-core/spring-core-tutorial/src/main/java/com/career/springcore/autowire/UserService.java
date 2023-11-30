package com.career.springcore.autowire;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService {


    private final UserDao userDao;

    List<String>  search(String str){
        Assert.notNull(str,"Search string should not be null");
        return userDao.search(str);
    }
}
