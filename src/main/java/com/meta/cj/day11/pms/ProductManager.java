package com.meta.cj.day11.pms;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService ps = new ProductService();
        while (true) {
            System.out.println("""
                    1. Show all products
                    2. Show max price products
                    3. Show products by price range
                    4. Search product by name
                    5. Exit
                    Enter your choice(1-5):""");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> ps.showAllProducts();
                case 2 -> ps.showMaxPriceProducts();
                case 3 -> {
                    System.out.println("Enter min and max price :");
                    double min = sc.nextDouble();
                    double max = sc.nextDouble();
                    ps.showProductsByPriceRange(min, max);
                }
                case 4 -> {
                    System.out.println("Enter product name :");
                    String name = sc.next();
                    ps.search(name);
                }
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }

        }
    }
}
