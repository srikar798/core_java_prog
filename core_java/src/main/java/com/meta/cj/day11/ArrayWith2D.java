package com.meta.cj.day11;

public class ArrayWith2D {

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {10, 11, 12, 13}
        };
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
