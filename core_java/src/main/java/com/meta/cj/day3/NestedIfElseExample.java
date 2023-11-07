package com.meta.cj.day3;

import java.util.Scanner;

public class NestedIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        if(num > 0){
            if( num % 2 == 0){
                num = num + 1;
            }
        }
        else{
            num = -num;
            num = num -1;
        }
        System.out.println(" Result is "+num);
    }
}
