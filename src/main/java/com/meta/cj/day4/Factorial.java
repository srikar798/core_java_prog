package com.meta.cj.day4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number for factorial function");
        int n = sc.nextInt();
        int res = 1;
        for(int i=1; i<=n ; i++){
            res = res * i;

        }
        System.out.println(" The factorial of "+ n + " is "+ res);
    }
}
