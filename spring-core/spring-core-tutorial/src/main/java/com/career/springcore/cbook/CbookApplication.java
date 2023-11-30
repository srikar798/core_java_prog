package com.career.springcore.cbook;

import com.career.springcore.cbook.service.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.career.springcore.cbook")
public class CbookApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CbookApplication.class);
        ContactService contactService = context.getBean(ContactService.class);
    }
}
