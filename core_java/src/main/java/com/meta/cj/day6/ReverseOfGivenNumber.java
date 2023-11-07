package com.meta.cj.day6;

import java.util.Scanner;

public class ReverseOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int n = reverse(num);
        System.out.println(" The reverse of " + num + " is " + n );
    }
    public static int reverse(int num ){
        int rev = 0;
        while( num != 0){
            int r = num % 10;
            rev = ( rev * 10 ) + r ;
            num /= 10;
        }
        return rev;
    }

}
