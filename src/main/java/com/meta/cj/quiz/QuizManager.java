package com.meta.cj.quiz;

import java.util.Scanner;

public class QuizManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String username = sc.next();
        System.out.println("Enter the quiz type (1.JAVA, 2.GK, 3.SPORTS) :");
        int ch = sc.nextInt();
        QuizType type = switch(ch){
            case 1 -> QuizType.JAVA;
            case 2 -> QuizType.GK;
            case 3 -> QuizType.SPORTS;
            default -> throw new IllegalArgumentException("Unexpected value: " + ch);
        };
        QuizService quizService = new QuizServiceImpl();
        quizService.startQuiz(username,type);
    }
}
