package com.hotelreservation;

import java.util.Scanner;

public class HotelReservationSystem {

    public static void main (String[] args){
        System.out.println("Welcome in Hotel Reservation System");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hotel Name");
        String hotelName = sc.next();
        System.out.println("Enter the  Hotel Rates for Regular Customer");
        float nRate = sc.nextFloat();


    }
}
