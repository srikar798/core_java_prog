package com.meta.cj.day26;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> twoEvenSquares =
                numbers.stream().filter(n -> {
                    System.out.println("filtering " + n);
                    return n % 2 == 0;
                }).map( n -> {
                    System.out.println("mapping " + n );
                    return n * n;
                }).limit(2).toList();
        System.out.println(twoEvenSquares);
        System.out.println("Done");

        List<String> list = List.of("Sai", "Srikar", "Srikanth");
        System.out.println(getWordsLength(list));
        System.out.println(sum(numbers));
    }

    private static List<Integer> getWordsLength(List<String> names){
        return names.stream().map(String :: length ).toList();
    }

    private static  int sum(List<Integer> list){
        return list.stream().reduce(0, Integer:: sum);
    }
}
