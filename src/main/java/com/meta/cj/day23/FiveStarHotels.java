package com.meta.cj.day23;

public class FiveStarHotels implements HotelFilter{

    public boolean test(Hotel hotel){
        return hotel.getType() == HotelType.FIVE_STAR;
    }
}
