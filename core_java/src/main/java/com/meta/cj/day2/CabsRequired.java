package com.meta.cj.day2;

import java.util.Scanner;

public class CabsRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the people count");
        int count = sc.nextInt();
        System.out.println(" Enter the cab capacity");
        int capacity = sc.nextInt();
        int required_cabs = count / capacity;
        if(count % capacity != 0) {
            required_cabs += 1 ;
        }
        System.out.println("To transport "+count + " people "+required_cabs+" cabs are required");
    }
}
