package com.meta.cj.day4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = ThreadLocalRandom.current().nextInt(1,7);
        for (int i= 1; i <=3; i++){
            System.out.println(" Guess the number (1-6)");
            int guessnum = sc.nextInt();

            if(num == guessnum){
                System.out.println(" You won the game");
                break;
            }else if(i < 3){
                System.out.println(" Wrong guess try again");
            }
            else{
                System.out.println("You reached max attempts, The number is "+ num);
            }
        }

    }
}
