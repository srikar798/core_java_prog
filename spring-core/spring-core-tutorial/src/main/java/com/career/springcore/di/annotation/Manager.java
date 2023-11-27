package com.career.springcore.di.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.career.springcore.di")
public class Manager {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Manager.class);
        GreetingController greetingController = applicationContext.getBean(GreetingController.class);
        String message = greetingController.greet("Srikar");
        System.out.println(message);
    }

}
