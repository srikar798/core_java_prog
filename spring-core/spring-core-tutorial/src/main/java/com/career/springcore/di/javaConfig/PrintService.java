package com.career.springcore.di.javaConfig;

public class PrintService {


    private Printer printer;
    public void print(String message){
        printer.print(message);
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
