package com.meta.cj.day26.iplstats;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public final class JsonReaderUtil {

    private JsonReaderUtil() {
    }

    public static <T> T readJson(String fileName, Class<T> clazz) {
        try{
            return new ObjectMapper().readValue(JsonReaderUtil.class.getResourceAsStream("/"+fileName), clazz);
        }catch (Exception e){
            e.printStackTrace();
        }
        throw new RuntimeException("Problem while reading json file");
    }

    public static <T> T readJson(String fileName, TypeReference<T> typeReference) {
        try{
            return new ObjectMapper().readValue(JsonReaderUtil.class.getResourceAsStream("/"+fileName), typeReference);
        }catch (Exception e){
            e.printStackTrace();
        }
        throw new RuntimeException("Problem while reading json file");
    }
}
