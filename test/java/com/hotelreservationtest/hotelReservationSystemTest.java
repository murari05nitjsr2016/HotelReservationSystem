package com.hotelreservationtest;

import com.hotelreservation.Hotel;
import com.hotelreservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;

import static com.hotelreservation.HotelReservationSystem.cheapestHotel;

public class hotelReservationSystemTest {

    @Test
    public void provideAllInformationsWhenAddedShouldReturnTrue()
    {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel = new Hotel("LakeWood",110);
        boolean result =  hotelReservationSystem.addHotel(hotel);
        Assertions.assertTrue(result);
    }

    @Test
    public void InGivenDateSlotShouldReturnChepeastHotelName() throws ParseException {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        String startingDate = "10sep2020";
        String lastDate = "11sep2020";
        ArrayList<Hotel> hotelList = new ArrayList<>();
        Hotel hotel =  cheapestHotel(hotelList,startingDate,lastDate);
        Assertions.assertEquals("LakeWood",hotel);
        
    }

}
