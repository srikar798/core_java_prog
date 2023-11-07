package com.meta.cj.quiz;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public final class JsonReaderUtil {

    private JsonReaderUtil(){

    }

    public static Quiz readJson(QuizType type) {
        String filename = "quiz/" + type.name().toLowerCase() + "_quiz" + ".json";
        ObjectMapper mapper = new ObjectMapper();
        Quiz quiz = null;
        try {
            quiz = mapper.readValue(JsonReaderUtil.class.getResourceAsStream("/" + filename), Quiz.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return quiz;
    }
}
