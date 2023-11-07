package com.meta.cj.day25;

import java.util.ArrayList;
import java.util.List;

public class AssignmentQuestion {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));

        System.out.println(sum(list));

        System.out.println(getThreeDivisbles(list));

        System.out.println(getSquareOfElements(list));

        System.out.println(getPrimeNumbers(list));

        System.out.println(replace(list));

        System.out.println(isEven(list));

        System.out.println(isOdd(list));



        // Get the sum of all elements

        // Get elements which are divisible by 3

        // Get another list which contains square of all elements

        // Get another list which contains only even numbers

        // Get another list which contains only odd numbers

        // replace all the even number with 10

        // Get another list which contains only prime numbers

    }

    private static double sum(List<Integer> list){
        double sum = 0;
        for(Integer i : list){
            sum += i;
        }
        return sum;
    }

    private static List<Integer> getThreeDivisbles(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list){
            if(i % 3 == 0){
                list1.add(i);
            }
        }
        return list1;
    }

    private static List<Integer> getSquareOfElements(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list){
            i = i * i;
            list1.add(i);
        }
        return list1;
    }

    private static List<Integer> getPrimeNumbers(List<Integer> list){

        List<Integer> resList = new ArrayList<>();
        for(Integer i : list){
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

    private static List<Integer> isEven(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list){
            if(i % 2 == 0){
                list1.add(i);
            }
        }
        return list1;
    }

    private static List<Integer> isOdd(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list){
            if(i % 2 != 0){
                list1.add(i);
            }
        }
        return list1;
    }
    private static List<Integer> replace(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list){
            if(i % 2 == 0){
                i = 10;
                list1.add(i);
            }else {
                list1.add(i);
            }
        }

        return list1;
    }
}
