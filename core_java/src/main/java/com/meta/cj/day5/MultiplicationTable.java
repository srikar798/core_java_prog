package com.meta.cj.day5;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int num=1; num<=20; num++ ){
            for(int n=1; n <=10; n++) {
                System.out.println(num + " * " + n + " = " + (num * n));
            }
            System.out.println("\n");
        }
    }
}
