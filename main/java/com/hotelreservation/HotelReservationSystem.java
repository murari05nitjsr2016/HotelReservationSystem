package com.hotelreservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
List<Hotel> hotelList = new ArrayList<>();

public boolean addHotel(){
    Hotel hotel = new Hotel();
   boolean isAdded =  hotelList.add(hotel);
   return isAdded;
}

    public static void main (String[] args){
        System.out.println("Welcome in Hotel Reservation System");
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();
    }
}
