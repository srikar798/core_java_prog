package com.meta.cj.quiz;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Question {

    private String qid;
    private String question;
    private List<String> options;
    private int answer;

}
