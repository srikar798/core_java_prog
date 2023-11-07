package com.meta.cj.day22;

import lombok.SneakyThrows;

import java.util.Scanner;

interface Printer{
    void print(String data);
}

class HpPrinter implements Printer{

    @Override
    public void print(String data) {
        System.out.println("Hp printer printing " + data);
    }
}

class SonyPrinter implements  Printer{
    @Override
    public void print(String data) {
        System.out.println("Sony printer printing "+ data);
    }
}

class EpsonPrinter implements Printer{
    @Override
    public void print(String data) {
        System.out.println("Epson printer printing "+ data);
    }
}

public class PrinterManager {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please choose (1-3)
                1. Hp Printer
                2. Sony Printer
                3. Epson Printer
                """);
        int p = scanner.nextInt();
        Printer printer = switch (p){
            case 1 -> new HpPrinter();
            case 2 -> new SonyPrinter();
            case 3 -> new EpsonPrinter();
            default -> throw new IllegalAccessException("Invalid choice "+ p);
        };
        System.out.println("Provide data to get printed");
        String data = scanner.next();
        printer.print(data);
    }
}
