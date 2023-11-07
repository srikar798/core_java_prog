package com.meta.cj.day5;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        int lb = 10;
        int ub = 100;

        for(int num = lb; num <= ub; num++){
            boolean isPrime = true;
            for(int i = 2; i <= num / 2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(num !=1 && isPrime){
                System.out.print(num + " ");
            }
        }

    }
}
