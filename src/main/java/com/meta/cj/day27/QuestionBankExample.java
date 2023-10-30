package com.meta.cj.day27;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

@Setter
@Getter
@ToString
@EqualsAndHashCode
class Question{
    private int qno;
    private String question;
}
public class QuestionBankExample {
    public static void main(String[] args) {
        List<Question> questions = initQuestions();
        // System.out.println(questions);

        Set<Question> questions1 = getQuestions(10,questions);
        System.out.println(questions1);
    }

    public static Set<Question> getQuestions(int n, List<Question> questions){

        Set<Question> set = new HashSet<>();
        while( set.size() != n){
            set.add(questions.get(ThreadLocalRandom.current().nextInt(1,questions.size())));
        }
        return set;
    }
    private static List<Question> initQuestions() {
        List<Question> questions = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            Question question = new Question();
            question.setQno(i);
            question.setQuestion("Question : " + i);
            questions.add(question);
        }
        return questions;
    }
}
