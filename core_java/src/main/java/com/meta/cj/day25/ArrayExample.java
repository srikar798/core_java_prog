package com.meta.cj.day25;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record Hotel(String name, String type, double pricePerNight,double rating,String city) {}


public class ArrayExample {

    public static void main(String[] args) {
        List<Hotel> hotels = getHotelDetails();
        System.out.println(hotels);
        System.out.println("-".repeat(50));
        System.out.println(getCityNames(hotels));
        System.out.println("-".repeat(50));
        System.out.println(getHotelNames(hotels));
        System.out.println("-".repeat(50));
        System.out.println(getHotelsByCity(hotels, "hyd"));
        System.out.println("-".repeat(50));
        System.out.println(getHotelsRatingGt(hotels,4));
    }
    private static List<String> getHotelsRatingGt(List<Hotel> hotels, double rating){
        // TODO : Return the list of hotel names whose rating is greater than given rating
        List<String> list = new ArrayList<>();
        for(Hotel hotel : hotels){
            if(hotel.rating() > rating){
                list.add(hotel.name());
            }
        }

        return list;
    }
    private static List<Hotel> getHotelsByCity(List<Hotel> hotels, String city){
        // TODO : Return the list of hotels based on city
        List<Hotel> list = new ArrayList<>();
        for(Hotel hotel : hotels){
            if(city.equalsIgnoreCase(hotel.city())) {
                list.add(hotel);
            }
        }
        return list;
    }
    // City name should be unique
    private static List<String> getCityNames(List<Hotel> hotels){
        // TODO : Return the list of city names
        List<String> list = new ArrayList<>();
        for(Hotel hotel : hotels){
            list.add(hotel.city());
        }
        return list;
    }
    private static List<String> getHotelNames(List<Hotel> hotels){
        // TODO : Return the list of hotel names
        List<String> list = new ArrayList<>();
        for(Hotel hotel : hotels){
            list.add(hotel.name());
        }
        return list;
    }
    private static List<Hotel> getHotelDetails(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(ArrayExample.class.getResourceAsStream("/hotel_data.json"), new TypeReference<List<Hotel>>(){});
        }catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
