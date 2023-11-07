package com.meta.cj.day20;

sealed abstract class Printer permits HPPrinter,CanonPrinter, SonyPrinter{
    public abstract void print(String data);
}

final class HPPrinter extends Printer{
    public void print(String data){
        System.out.println("HP printer :"+ data);
    }
}

final class CanonPrinter extends Printer{

    public void print(String data){
        System.out.println("Canon printer :"+ data);
    }
}

final class SonyPrinter extends Printer{
    public void print(String data){
        System.out.println("Sony printer :"+ data);
    }
}
public class PrinterManager {

    public static void main(String[] args) {


        Printer obj = new CanonPrinter();

        obj.print("hello");

        Printer obj1 = new SonyPrinter();

        obj1.print("hi");

    }
}
