package com.hotelreservation;

import java.util.Scanner;

public class Hotel {
    String hotelName;
    Integer weekDayRate;
    Integer weekendRates;
    public Hotel() {
    }
    public Hotel(String hotelName, Integer regularCustomerRate ) {
      this.hotelName = hotelName;
       this.weekDayRate = regularCustomerRate;
    }
    public Hotel(String hotelName, Integer regularCustomerRate, Integer weekendRates) {
        this.hotelName = hotelName;
        this.weekDayRate = regularCustomerRate;
        this.weekendRates = weekendRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", regularCustomerRate=" + weekDayRate +
                '}';
    }

    public String getHotelName() {

        return hotelName;
    }

    public void setHotelName(String hotelName) {

        this.hotelName = hotelName;
    }

    public Integer getRegularCustomerRate() {
        return weekDayRate;
    }

    public void setRegularCustomerRate(Integer regularCustomerRate) {

        this.weekDayRate = regularCustomerRate;
    }

    public Integer getWeekendRates() {
        return weekendRates;
    }

    public void setWeekendRates(Integer weekendRates) {
        this.weekendRates = weekendRates;
    }
}

