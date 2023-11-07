package com.meta.cj.day1;

import java.util.Scanner;
public class EmiCalculator{
	
		public static void main(String[] args){
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the amount :");
				double p = sc.nextDouble();
				System.out.println("Enter the interest rate (%) :");
				double r = sc.nextDouble();
				System.out.println("Enter the number of months :");
				double n = sc.nextDouble();
				
				double rn = r / 12 / 100;				
				double emi = p * rn * ( Math.pow(1+rn,n) / (Math.pow(1+rn,n)-1));
				double totalAmount = emi * n;
			    double totalInterest = totalAmount - p;
				
				System.out.println("EMI Amount     :"+Math.round(emi));
				System.out.println("Total Interest :"+Math.round(totalInterest));
				System.out.println("Total Amount   :"+Math.round(totalAmount));
				
				
		}
}