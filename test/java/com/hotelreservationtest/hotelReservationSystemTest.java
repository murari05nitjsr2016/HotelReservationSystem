package com.hotelreservationtest;

import com.hotelreservation.Hotel;
import com.hotelreservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;

import static com.hotelreservation.HotelReservationSystem.*;
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
        Hotel hotel1 = new Hotel("LakeWood",110);
        Hotel hotel2 = new Hotel("BridgeWood",150);
        hotelReservationSystem. addHotel(hotel1);
        hotelReservationSystem. addHotel(hotel2);
        String startingDate = "10sep2020";
        String lastDate = "11sep2020";
        Hotel hotel = cheapestHotel(hotelList,startingDate,lastDate);
        Assertions.assertEquals("LakeWood",hotel.getHotelName());
        
    }
    @Test
    public void provideAllInformationsWhenAddedWeekendRateShouldReturnTrue()
    {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel = new Hotel("LakeWood",110,90);
        boolean result =  hotelReservationSystem.addHotel(hotel);
        Assertions.assertTrue(result);
    }

    @Test
    public void provideAllInformationsWhenAddedWeekendRateShouldReturnFalse()
    {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel = new Hotel("LakeWood",110,90);
        boolean result =  hotelReservationSystem.addHotel(hotel);
        Assertions.assertFalse(result);
    }
    @Test
    public void addedWeekendRateShouldReturnCheapestHotel() throws ParseException {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel1 = new Hotel("LakeWood",110,90);
        Hotel hotel2 = new Hotel("BridgeWood",150,50);
        hotelReservationSystem. addHotel(hotel1);
        hotelReservationSystem. addHotel(hotel2);
        String startingDate = "10sep2020";
        String lastDate = "11sep2020";
        Hotel hotel = cheapestHotel(hotelList,startingDate,lastDate);
        Assertions.assertEquals("LakeWood",hotel.getHotelName());
    }

}
