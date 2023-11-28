package com.career.springcore.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.career.springcore.lifecycle")
public class Manager {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
        DataLoaderService dataLoaderService = context.getBean(DataLoaderService.class);
        context.close();
    }
}
