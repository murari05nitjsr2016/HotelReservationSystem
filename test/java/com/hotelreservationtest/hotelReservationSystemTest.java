package com.hotelreservationtest;

import com.hotelreservation.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class hotelReservationSystemTest {
    @Test
    public void provideAll3InformationsWhenAddedShouldReturnTrue()
    {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        boolean result =   hotelReservationSystem.addHotel();
        Assertions.assertTrue(result);
    }
}
