package com.meta.cj.day23;

import java.util.ArrayList;
import java.util.List;

public class HotelService {

    private List<Hotel> hotels;

    public HotelService(){
        hotels = JsonReaderUtil.loadHotelData();
    }

    public void showHotels(){
        for(Hotel hotel : hotels){
            System.out.println(hotel);
        }
    }

    public List<Hotel> getFilteredHotels( HotelFilter hotelFilter){
        List<Hotel> gethotels = new ArrayList<>();
        for(Hotel hotel : hotels){
            if(hotelFilter.test(hotel)){
                gethotels.add(hotel);
            }
        }
        return gethotels;
    }

    public List<Hotel> get5StarHotels(HotelType hotelType){
        List<Hotel> hotelStarList = new ArrayList<>();
        for(Hotel hotel : hotels){
            if(hotel.getType() == hotelType){
                hotelStarList.add(hotel);
            }
        }
        return hotelStarList;
    }

    public List<Hotel> getHotels(HotelType hotelType, String city){
        List<Hotel> filterCityAndTypeList = new ArrayList<>();
        for(Hotel hotel : hotels){
            if( hotel.getCity().equalsIgnoreCase(city) && hotel.getType().equals(hotelType)){
                filterCityAndTypeList.add(hotel);
            }
        }
        return filterCityAndTypeList;
    }

    public List<Hotel> getHotels(HotelType hotelType, String city, double rating){
        List<Hotel> filterCityAndTypeAndRating = new ArrayList<>();
        for(Hotel hotel : hotels){
            if(hotel.getType().equals(hotelType) && hotel.getCity().equalsIgnoreCase(city) && hotel.getRating() >= rating){
                filterCityAndTypeAndRating.add(hotel);
            }
        }
        return filterCityAndTypeAndRating;
    }
    public boolean is5StarHotel(Hotel hotel){
        return hotel.getType() == HotelType.FIVE_STAR ;
    }

}
