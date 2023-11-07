package com.meta.cj.day6;

import java.util.Scanner;

public class MultiplicationTableUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number :");
        int num = sc.nextInt();
        int i = 1;
        while(i <=10){
            System.out.println( num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
