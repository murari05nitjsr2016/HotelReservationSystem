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

    public static  Hotel cheapestHotel(ArrayList<Hotel> hotelList,String startingDate,String lastDate) throws ParseException {
        SimpleDateFormat formatter=new SimpleDateFormat("ddMMMyyyy");
        Date date1 = formatter.parse(startingDate);
        Date date2 = formatter.parse(lastDate);
        long diff = date2.getTime() - date1.getTime();
        int days = (int) (diff / (1000*60*60*24));
        System.out.println("Days between: " + days);
        Hotel hotel = hotelList.stream().min(Comparator.comparingInt(Hotel::getRegularCustomerRate)).get();
        int  TotalRates = days * hotel.getRegularCustomerRate();
        System.out.println("Hotel Name - "+hotel.hotelName +", TotalRate:"+TotalRates);
        return hotel;
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
        String startingDate = "10sep2020";
        String lastDate = "11sep2020";
        cheapestHotel(hotelList,startingDate,lastDate);

    }
}
