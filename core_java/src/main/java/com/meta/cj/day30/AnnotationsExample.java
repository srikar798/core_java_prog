package com.meta.cj.day30;

import jdk.jshell.MethodSnippet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String name();
    String value();
}
class One{
    @MyAnnotation(name ="ope", value = "add")
    public void perform(int a,int b){
        System.out.println("M1 method");
    }
}
public class AnnotationsExample {

    public static void main(String[] args) {
        Class cls = null;
        try {
            cls = Class.forName("com.meta.cj.day30.One");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Method[] methods = cls.getDeclaredMethods();
        for(Method method: methods){
            System.out.println(method.getName());
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            String name = myAnnotation.name();
            String value = myAnnotation.value();
            System.out.println(name + " "+ value);
        }
    }
}
