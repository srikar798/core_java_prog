package com.meta.cj.day23;

import java.util.List;

public class HotelManager {

    public static void main(String[] args) {

        List<Hotel> hotels = JsonReaderUtil.loadHotelData();
        System.out.println("Total hotels " + hotels.size());

        HotelService service = new HotelService();
        System.out.println("-".repeat(30));


        List<Hotel> fiveStarList = service.getFilteredHotels(new FiveStarHotels());
        System.out.println(fiveStarList);

        System.out.println("-".repeat(30));

        List<Hotel> hotelRating = service.getFilteredHotels(new HotelRatingFilter());
        System.out.println(hotelRating);
        System.out.println("-".repeat(30));

        //get hotels in hyd
        List<Hotel> filteredHotels = service.getFilteredHotels(new HotelFilter() {
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getCity().equalsIgnoreCase("Hyd");
            }
        });

        //get hotels with Type - FOUR_STAR

        List<Hotel> filteredHotel = service.getFilteredHotels(hotel -> hotel.getType().equals(HotelType.FOUR_STAR));


        // get hotels having Rating > 4.5
        List<Hotel> RatingHotels = service.getFilteredHotels(hotel -> hotel.getRating() >= 4.5f);
        System.out.println(RatingHotels);
        System.out.println("-".repeat(50));
        System.out.println(filteredHotels);





    }
}
