package com.meta.cj.day23;

public class HotelRatingFilter implements HotelFilter{

    public boolean test(Hotel hotel){
        return hotel.getRating() >= 4.5f;
    }
}
