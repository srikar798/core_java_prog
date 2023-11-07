package com.meta.cj.day22;

import java.util.ArrayList;
import java.util.List;

interface NumberOpe{
    boolean isPrime(int num);
    double factorial(int num);
    int gcd(int a, int b);

    default List<Integer> primeInRange(int lb,int ub){
        List<Integer> list = new ArrayList<>();
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    default double sumOfSeries(int n){
        double res = 1;
        for(int i=1;i<=n;i++){
            res += 1.0/i;
        }
        return res;
    }
    default int gcd(int... arr){
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = gcd(res,arr[i]);
        }
        return res;
    }
}

class NumberOpeImpl implements NumberOpe {

    @Override
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double factorial(int num) {
        int fact = 1;
        if (num == 0 || num == 1) {
            return fact;
        }
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    @Override
    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    private boolean isEven(int num){
        return num % 2 == 0;
    }
    public static String getJDKVersion(){
        String version = System.getProperty("java.version");
        String homeDir = getJDKHome();
        return String.format("JDK Version : %s, Home : %s",version,homeDir);
    }
    private static String getJDKHome(){
        return System.getProperty("java.home");
    }

}

public class DefaultMethodInterfaces {

}
