package com.meta.cj.day23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExamples {

    public static void main(String[] args) {
        List<Integer> list = List.of(10,11,15,17,19,20,25,26,27,28,29,30,35,40,45,46,48,50,55,60,65,70,75,80,85,90,95,100);


        List<Integer> evenList = filter(list,num -> num % 2 == 0);
        System.out.println(evenList);

        Predicate<Integer> primePredicate = num -> isPrime(num);
        List<Integer> primeList = filter(list, primePredicate);
        System.out.println(primeList);

        List<Integer> inBetweenNumbers = filter(list, num -> (num >=20 && num <= 50));
        System.out.println(inBetweenNumbers);
        List<Integer> listDivisibleBy5 = filter(list, num -> num % 5 == 0);
        System.out.println(listDivisibleBy5);

    }

    private static boolean isEven(int num){
        return num % 2 == 0;
    }
    private static boolean isPrime(int num){
        if( num < 2 ){
            return false;
        }
        for(int i = 2; i<= num/2 ; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate){

        List<Integer> filteredList = new ArrayList<>();
        for(Integer ele : list){
            if(predicate.test(ele)){
                filteredList.add(ele);
            }
        }
        return filteredList;
    }
}
