package com.career.springcore.di.javaConfig;

public class HpPrinter implements Printer {

    @Override
    public void print(String msg) {
        System.out.println("Hp printer : "+ msg);
    }

}
