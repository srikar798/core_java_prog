package com.junit;

public class EmiCalculator {

    public double calculateEmi(double p,double rate,int n){
        double rn = rate / 12 / 100;
        return Math.round(p * rn * (Math.pow(1+rn,n) / (Math.pow(1+rn,n) - 1)));
    }
}
