package com.meta.cj.day11.pms;

public class ProductService {

    private Product[] arr;

    public ProductService() {
            init();
    }
    private void init(){
        Product p1 = new Product(1001, "iPhone15", 120000);
        Product p2 = new Product(1002, "iPhone12", 100000);
        Product p3 = new Product(1003, "iPhone11", 80000);
        Product p4 = new Product(1004, "iPhone10", 70000);
        Product p5 = new Product(1005, "iPhone9", 60000);
        Product p6 = new Product(1006, "Samsung", 50000);
        Product p7 = new Product(1007, "OnePlus", 40000);
        Product p8 = new Product(1008, "Vivo", 120000);
        Product p9 = new Product(1009, "Oppo", 20000);
        Product p10 = new Product(1010, "RealMe", 10000);
        arr = new Product[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
    }

    public void showAllProducts() {
        System.out.println("-".repeat(50));
        for (Product product : arr) {
            System.out.println(product.getPid() + " " + product.getPname() + " " + product.getPrice());
        }
        System.out.println("-".repeat(50));
    }

    public void showMaxPriceProducts() {
        double maxPrice = getMaxPrice();
        System.out.println("-".repeat(50));
        for (Product product : arr) {
            if (product.getPrice() == maxPrice) {
                System.out.println(product.getPid() + " " + product.getPname() + " " + product.getPrice());
            }
        }
        System.out.println("-".repeat(50));
    }

    public void showProductsByPriceRange(double min, double max) {
        System.out.println("-".repeat(50));
        for (Product product : arr) {
            if (product.getPrice() >= min && product.getPrice() <= max) {
                System.out.println(product.getPid() + " " + product.getPname() + " " + product.getPrice());
            }
        }
        System.out.println("-".repeat(50));
    }

    public void search(String str) {
        System.out.println("-".repeat(50));
        for (Product product : arr) {
            if(product.getPname().toLowerCase().contains(str.toLowerCase())){
                System.out.println(product.getPid() + " " + product.getPname() + " " + product.getPrice());
            }
        }
        System.out.println("-".repeat(50));
    }

    private double getMaxPrice() {
        double maxPrice = arr[0].getPrice();
        for (int i = 1; i < arr.length; i++) {
            double price = arr[i].getPrice();
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

}