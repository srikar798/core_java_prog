package com.meta.cj.day17;

import java.util.Objects;

class Product{

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
public class ObjectClassMethods {

    public static void main(String[] args) {

        Product product = new Product("Dell", 1000);
        System.out.println(product.toString());

        Product product1 = new Product("Dell", 1000);
        Product product2 = new Product("Dell", 1000);
        Product product3 = product1;

        System.out.println(product1 == product2);
        System.out.println(product1 == product3);

        String name1 = new String ("Java Class");
        String name2 = new String ("Java Class");

        System.out.println(name1.equals(name2 ));
        System.out.println(product1.equals(product2));

    }

}
