package com.meta.cj.day30;

import java.lang.reflect.Method;

public class ReflectionApiExample {
    public static void main(String[] args) {
        try{
            Class cls = Class.forName("com.meta.cj.day30.ReportServiceImpl");
            String superClass = cls.getSuperclass().getName();
            System.out.println(superClass);
            Method[] methods = cls.getDeclaredMethods();
            for(Method m : methods){
                System.out.println(m.getName());
            }
            Class[] interfaces = cls.getInterfaces();
            for(Class i : interfaces){
                System.out.println(i.getName());
            }
        }catch (ClassNotFoundException e){
            throw new RuntimeException();
        }
    }

}
