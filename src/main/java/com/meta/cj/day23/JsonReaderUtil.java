package com.meta.cj.day23;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonReaderUtil {
    private static final String FILE_NAME = "/hotel_data.json";
    public static List<Hotel> loadHotelData(){

        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.readValue(JsonReaderUtil.class.getResourceAsStream(FILE_NAME), new TypeReference<>() {});
        } catch (Exception e){
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
            throw new RuntimeException("Failed to load hotel data");
        }

    }
}
