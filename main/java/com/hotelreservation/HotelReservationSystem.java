package com.hotelreservation;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservationSystem {
   public   static ArrayList<Hotel> hotelList = new ArrayList<>();
public  static  boolean addHotel(Hotel hotel){
   return hotelList.add(hotel);
}

    public static int getWeekEndCount(LocalDate fromDate, LocalDate toDate) {
       // DateTimeFormatter formatter = new DateTimeFormatter.ofPattern()
       int weekendCount = 0 ;
        while (!fromDate.isAfter(toDate)) {
            if (fromDate.getDayOfWeek().equals(DayOfWeek.SATURDAY))
                weekendCount++;
            else if (fromDate.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                weekendCount++;
            fromDate = fromDate.plusDays(1);
        }
        return weekendCount;
    }

    public static  Hotel cheapestHotel(ArrayList<Hotel> hotelList,String startingDate,String lastDate) throws ParseException {
       SimpleDateFormat formatter=new SimpleDateFormat("ddMMMyyyy");
       Date date1 = formatter.parse(startingDate);
       Date date2 = formatter.parse(lastDate);
       LocalDate l1  = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       LocalDate l2  = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       long daysBetween = ChronoUnit.DAYS.between(l1,l2);
       System.out.println("Days between: " + daysBetween);
       Hotel hotel = hotelList.stream().min(Comparator.comparingInt(Hotel::getRegularCustomerRate)).get();
       long TotalRates = daysBetween * hotel.getRegularCustomerRate();
       System.out.println("Hotel Name - "+hotel.hotelName +", TotalRate:"+TotalRates);
       return hotel;
    }

    public static void main (String[] args) throws ParseException {
        System.out.println("Welcome in Hotel Reservation System");
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotel1 = new Hotel("LakeWood",110,90);
        addHotel(hotel1);
        Hotel hotel2 = new Hotel("BridgeWood",150,50);
        addHotel(hotel2);
        Hotel hotel3 = new Hotel("RidgeWood",220,150);
        hotelReservationSystem.addHotel(hotel3);
        String startingDate = "10sep2020";
        String lastDate = "25sep2020";
        cheapestHotel(hotelList,startingDate,lastDate);

    }
}
