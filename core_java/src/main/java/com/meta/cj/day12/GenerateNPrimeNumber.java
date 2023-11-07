package com.meta.cj.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateNPrimeNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value :");
        int N = sc.nextInt();
        List<Integer> list = generatePrimeNumbers(N);
        System.out.println(list);
        System.out.println(getPrimeNumbers(10, 100));

    }

    private static List<Integer> generatePrimeNumbers(int N) {
        List<Integer> primeList = new ArrayList<>();
        int i = 2;
        while (primeList.size() != N) {
            if (isPrime(i)) {
                primeList.add(i);
            }
            i++;
        }
        return primeList;
    }

    private static boolean isPrime(int num) {
        if (num < 2 || (num % 2 == 0 && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Get the prime numbers between lb and ub
    // 5 and 10 => 5,7
    // 10 and 20 => 11,13,17,19
    // 10 and 100 => 11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71

    private static List<Integer> getPrimeNumbers(int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }


}
