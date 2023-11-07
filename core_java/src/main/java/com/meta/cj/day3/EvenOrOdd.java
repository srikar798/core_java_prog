package com.meta.cj.day3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the number : ");
        int number = sc.nextInt();
        if( number % 2 == 0){
            System.out.println("Entered Number " + number +" is even");
        }

        else {
            System.out.println("Entered Number " + number +" is odd");
        }
    }
}
