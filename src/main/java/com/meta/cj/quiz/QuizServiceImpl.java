package com.meta.cj.quiz;

import lombok.SneakyThrows;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class QuizServiceImpl implements QuizService {

    @SneakyThrows
    public void startQuiz(String username, QuizType type){
        Quiz quiz = getQuiz(type);
        List<Question> questions = quiz.getQuestions();

        System.out.println("Welcome :" +username);
        System.out.println("You have selected " +type + " quiz and total questions are "+ questions.size());
        System.out.println("Please wait your quiz is going to start ...");
        TimeUnit.SECONDS.sleep(3);

        Scanner sc = new Scanner(System.in);

        int score = 0;
        for(Question question: questions){
            System.out.println(question.getQid() + ")" + question.getQuestion());
            int i = 1;
            for(String option : question.getOptions()){
                System.out.println(i++ + ". " +option);
            }
            System.out.println("Enter the answer: ");
            int ch = sc.nextInt();
            if(question.getAnswer() == ch){
                score++;
            }
        }
        System.out.println("Please wait your answers are getting verified ...");
        TimeUnit.SECONDS.sleep(3);
        showQuizResult(username,score,questions.size());
    }

    private void showQuizResult(String username, int correctAnswers, int size){
        System.out.println("Dear :" +username);
        System.out.println("You have answered " + correctAnswers + " out of " + size + " correctly.");
    }
    public Quiz getQuiz(QuizType type){
        return JsonReaderUtil.readJson(type);
    }
}
