package com.meta.cj.day30;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate dateAfter10Days = date.plusDays(10);
        System.out.println(dateAfter10Days);

        long days = ChronoUnit.MINUTES.between(time,time.plusMinutes(20));
        System.out.println(days);
        String dateStr = "1988-08-06";
        String dateStr1 = "06-08-1988";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob1 = LocalDate.parse(dateStr1,formatter);
        System.out.println(dob1);
        LocalDate dob = LocalDate.parse(dateStr);
        System.out.println(dob);
        System.out.println(dob.getMonth());

    }
}
