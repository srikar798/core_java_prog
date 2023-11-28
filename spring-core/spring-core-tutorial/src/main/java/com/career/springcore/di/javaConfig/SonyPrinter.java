package com.career.springcore.di.javaConfig;

public class SonyPrinter implements Printer {

    @Override
    public void print(String msg) {
        System.out.println("Sony printer : "+ msg);
    }
}
