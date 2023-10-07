package com.meta.cj.day11;

public class PatternExample {

    public static void main(String[] args) {

            int[][] arr = new int[][]{
                    {1,1,1,1,1},
                    {1,0,0,0,1},
                    {1,0,0,0,1},
                    {1,0,0,0,1},
                    {1,1,1,1,1},
                    {1,0,0,0,1},
                    {1,0,0,0,1},
                    {1,0,0,0,1},
                    {1,0,0,0,1},
            };

            for(int[] ints : arr){
                for(int ele : ints){
                    if(ele == 1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
}
