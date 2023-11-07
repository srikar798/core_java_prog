package com.meta.cj.day7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the num1 ");
        int num1 = sc.nextInt();
        System.out.println(" Enter the num2 ");
        int num2 = sc.nextInt();
        System.out.println(" Enter the operator (+,-,*,/,%) :");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println( num1 + "+" + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println( num1 + "-" + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println( num1 + "*" + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println( num1 + "/" + num2 + " = " + (num1 / num2));
                break;
            case '%':
                System.out.println( num1 + "%" + num2 + " = " + (num1 % num2));
                break;
            default :
                System.out.println(" Invalid Operator ");
        }
    }
}
