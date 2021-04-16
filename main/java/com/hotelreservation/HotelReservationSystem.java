package com.hotelreservation;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservationSystem {
     static ArrayList<Hotel> hotelList = new ArrayList<>();
public  static  boolean addHotel(Hotel hotel){
   return hotelList.add(hotel);
}

    public static void main (String[] args) throws ParseException {
        System.out.println("Welcome in Hotel Reservation System");
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel1 = new Hotel("LakeWood",110);
        addHotel(hotel1);
        Hotel hotel2 = new Hotel("BridgeWood",160);
        addHotel(hotel2);
        Hotel hotel3 = new Hotel("RidgeWood",220);
        hotelReservationSystem.addHotel(hotel3);
    }
}
