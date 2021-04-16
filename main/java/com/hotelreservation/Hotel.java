package com.hotelreservation;

import java.util.Scanner;

public class Hotel {
    String hotelName;
    Integer regularCustomerRate;


    public Hotel() {

    }

    public Hotel(String hotelName, Integer regularCustomerRate ) {
      this.hotelName = hotelName;
       this.regularCustomerRate = regularCustomerRate;

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", regularCustomerRate=" + regularCustomerRate +
                '}';
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public void setRegularCustomerRate(Integer regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }


}

