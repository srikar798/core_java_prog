package com.meta.cj.day25;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiistExample1 {

    public static void main(String[] args) {

        int lb = 10;
        int ub = 35;
        List<Integer> primeList = generatePrimeNumbers(lb,ub);
        System.out.println(primeList);
        System.out.println("List size of prime number are :" + primeList.size());
    }

    private static List<Integer> generatePrimeNumbers(int lb, int ub){

        List<Integer> resList = new ArrayList<>();
        for(int i = lb ; i <= ub ; i++){
            if(isPrime(i)){
                resList.add(i);
            }
        }
        return resList;
    }


    private static boolean isPrime(int num){
        if(num < 2 || (num % 2 == 0 && num != 2)){
            return false;
        }
        for(int i =2; i <= num/2 ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
