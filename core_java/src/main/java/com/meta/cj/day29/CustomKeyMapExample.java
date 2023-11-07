package com.meta.cj.day29;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
class ProductKey{
    private int id;
    private String name;
}


@Getter
@Setter
@AllArgsConstructor
class ProductDetails{
    private int id;
    private double amount;
}
public class CustomKeyMapExample {
    public static void main(String[] args) {
        Map<ProductKey,ProductDetails> map = new HashMap<>();
        ProductKey key1 = new ProductKey(1001,"Dell Laptop");
        ProductKey key2 = new ProductKey(1002,"HP Laptop");
        ProductKey key3 = new ProductKey(1001,"Dell Laptop");
        ProductDetails details1 = new ProductDetails(1001,45000);
        ProductDetails details2 = new ProductDetails(1002,55000);
        ProductDetails details3 = new ProductDetails(1001,45000);
        map.put(key1,details1);
        map.put(key2,details2);
        map.put(key3,details3);
        System.out.println(map.size());
    }


}
