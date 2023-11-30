package com.career.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.career.springcore.jdbc")
public class JdbcManager {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcManager.class);
        PlayerDao playerDao = context.getBean(PlayerDao.class);
        System.out.println(playerDao.countOfPlayers());
    }
}
