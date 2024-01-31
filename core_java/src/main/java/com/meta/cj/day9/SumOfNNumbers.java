package com.meta.cj.day9;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value");
        int N = sc.nextInt();
        int[] ar = new int[N];
        for(int i = 0; i< N; i++){
            System.out.println("Please enter " + (i+1) + " element");
            ar[i] = sc.nextInt();
        }
        double sum = 0;
        for(int i : ar){
            sum+= i;
        }
        double avg;
        System.out.println("the sum of the N numbers is " + sum);
        System.out.println("the average of numbers is " + (sum/N));
        sc.close();
    }
}
