package com.meta.cj.day16;

class Product{
    private int pid;
    private String pname;
    private double price;
    private static int count = 0;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        count++;
    }



    public static void showCount(){
        System.out.println("Total number of objects created :"+count);
    }
}
public class CountNumberOfObjects {

    public static void main(String[] args) {


        Product.showCount();
        Product p1 = new Product(1001, "Dell Laptop", 45000);
        Product p2 = new Product(1002, "HP Laptop", 55000);
        Product p3 = new Product(1003, "Lenovo Laptop", 65000);
        Product p4 = new Product(1004, "Acer Laptop", 35000);
        Product p5 = new Product(1005, "Asus Laptop", 75000);
        Product.showCount();
    }
}
