package com.career.springcore.di.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.career.springcore.di.javaconfig")
public class Manager {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
        PrintService printService = context.getBean(PrintService.class);
        printService.print("Hello Spring");

        NumberOperations obj = context.getBean(NumberOperations.class);
        obj.showNumbers(new int[]{3,4,2,1,5,9,7});
    }

}
