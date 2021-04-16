package com.hotelreservationtest;

import com.hotelreservation.Hotel;
import com.hotelreservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class hotelReservationSystemTest {

    @Test
    public void provideAllInformationsWhenAddedShouldReturnTrue()
    {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel = new Hotel("LakeWood",110);
        boolean result =  hotelReservationSystem.addHotel(hotel);
        Assertions.assertTrue(result);
    }

}
