package com.meta.cj.day26;


import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
class Product{
    private int pid;
    private String pname;
    private double price;

    @Override
    public boolean equals(Object o) {
        System.out.println("Calling equals method");
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getPid() == product.getPid() && Double.compare(getPrice(), product.getPrice()) == 0 && Objects.equals(getPname(), product.getPname());
    }

    @Override
    public int hashCode() {
        System.out.println("Calling hashCode method");
        return Objects.hash(getPid(), getPname(), getPrice());
    }
}
public class SetExampleWithCustomObject {

    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product p1 = new Product(1001,"Dell", 45000);
        Product p2 = new Product(1002,"HP", 35000);
        Product p3 = new Product(1001,"Dell", 45000);
        Product p4 = new Product(1003,"Lenovo", 25000);
        Product p5 = new Product(1002,"HP", 35000);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        System.out.println(products.size());
    }
}
