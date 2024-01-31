package com.meta.cj.day9;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FindBiggestOfNNumbers {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = ThreadLocalRandom.current().nextInt(1,10);
        }
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println("Prime numbers count " + countOfPrimes(arr));
    }
    private static int countOfPrimes(int[] arr){
        int count =0;
        for(int i : arr){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num){
        if(num <= 1 ){
            return false;
        }
        for(int i = 2;i <= num/2;i++){
            if(num % i == 0 && num != 2){
                return false;
            }
        }
        return true;
    }
}
