package com.meta.cj.day6;

import java.util.Scanner;

public class SumOfGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while ( num != 0){
            int r = num % 10;
            sum += r;
            num /=10;
        }
        System.out.println(" Sum of the digits of  " + temp + " number is " + sum );
    }
}
