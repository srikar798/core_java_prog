package com.meta.cj.day21;

import com.meta.cj.day20.PrinterManager;

import java.util.Locale;

record Employee(String empno,String name,String email, double salary){

    public static final String DOMAIN_NAME = "mad.com";
    public Employee(String empno,String name, double salary){
        this(empno,name,name.toLowerCase() + "@"+DOMAIN_NAME , salary);
    }
    public Employee updateSalary(double salary){
        return new Employee(this.empno,this.name,salary);
    }
    public static String getDomainName(){
        return DOMAIN_NAME;
    }
}
class Product{

    private final String pid;
    private final String pname;
    private final double price;

    public Product(String pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public Product updatePrice(double price){
        return new Product(this.pid,this.pname,price);
    }
    public String getPid() {
        return pid;
    }



    public String getPname() {
        return pname;
    }



    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
}
public class ImmutableObjectManager {
    public static void main(String[] args) {

        Product product = new Product("P001","Dell Laptop", 45000);
        System.out.println(product);
        Product product1 = product.updatePrice(50000);
        System.out.println(product1);

        Employee emp1 = new Employee("EMP01","Krish", "krish@ma.com",30000);
        Employee emp2 = new Employee("EMP02","Sai",45000);
        System.out.println(emp1);
    }
}
