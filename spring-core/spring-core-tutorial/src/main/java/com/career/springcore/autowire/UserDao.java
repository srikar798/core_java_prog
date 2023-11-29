package com.career.springcore.autowire;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private List<String> users;

    public void init(){
        users = List.of("Krish","Manoj","Charan","Tanvi","Rajesh","Suresh","Mahesh");
    }

    public List<String> search(String str){

        List<String> list = new ArrayList<>();
        for(String user:users){
            if(user.toLowerCase().contains(str.toLowerCase())){
                list.add(user);
            }
        }
        return list;
    }
}
