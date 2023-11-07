package com.meta.cj.day7;

import java.util.Scanner;

public class ShowDayName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the day (1-7) :");
        int num = sc.nextInt();
        String dayName = getDayName(num);
        System.out.println("The name of the day is " + dayName);
        System.out.println(" Enter the month name (1-12) :");
        int month = sc.nextInt();
        String monthName = getMonthName(month);
        System.out.println(" The name of the Month is " + monthName);
        System.out.println("Enter the year :");
        int year = sc.nextInt();
        int noOfDays = getNoOfDaysInMonthAndYear(year, month);
        System.out.println("Number of days in the month of " + monthName + " in the year " + year + " is " + noOfDays);
    }
    public static String getDayName(int n) {
        return switch(n){
            case 1 -> "Monday";

            case 2 -> "Tuesday";

            case 3 -> "Wednesday";

            case 4 -> "Thursday";

            case 5 -> "Friday";

            case 6 -> "Saturday";

            case 7 -> "Sunday";

            default -> "Invalid day number";
        };
    }
    public static String getMonthName(int n){
        return switch (n){
          case 1 -> "January";
          case 2 -> "February";
          case 3 -> "March";
          case 4 -> "April";
          case 5 -> "May";
          case 6 -> "June";
          case 7 -> "July";
          case 8 -> "August";
          case 9 -> "September";
          case 10 -> "October";
          case 11 -> "November";
          case 12 -> " December";
          default -> "Invalid Number";

        };
    }
    public static int getNoOfDaysInMonthAndYear(int year, int month) {
        int noOfDays = 0;
        switch (month){
            case 1,3,5,7,8,10,12 -> noOfDays = 31;
            case 2 -> {
                if (isLeapYear(year)) {
                    noOfDays = 29;
                } else {
                    noOfDays = 28;
                }
            }
            case 4,6,9,11 -> noOfDays = 30;
            default -> noOfDays = -1;

        };
        return noOfDays;
    }
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}
