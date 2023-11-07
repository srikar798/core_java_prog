package com.meta.cj.day3;

import java.util.Scanner;

public class DiscountForBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Eneter the bill amount");
        double billamount = sc.nextDouble();

        double discount = 0;

        if(billamount > 1000){
            discount    = billamount * 0.1;
        }
        double  netamount = billamount - discount;

        System.out.println(" The bill after disocunt is "+netamount);
    }
}
