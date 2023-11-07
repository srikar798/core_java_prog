package com.meta.cj.day3;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println(" Enter the num1 : ");
        int num1 = Scan.nextInt();
        System.out.println(" Enter the num2 : ");
        int num2 = Scan.nextInt();
        System.out.println(" Enter the num3 : ");
        int num3 = Scan.nextInt();
        int big;
        if (num1 > num2 && num1 > num3){
            big = num1;
        }else if (num2 > num3){
            big = num2;
        }else {
            big = num3;
        }
        System.out.println(" The biggest of all three is "+big);
    }
}
