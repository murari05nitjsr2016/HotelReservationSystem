package com.hotelreservation;

import java.util.Scanner;

public class Hotel {
    String hotelName;
    Integer weekDayRate;
    Integer weekendRates;
    public Hotel() {
    }
    public Hotel(String hotelName, Integer weekDayRate ) {
      this.hotelName = hotelName;
       this.weekDayRate = weekDayRate;
    }
    public Hotel(String hotelName, Integer weekDayRate, Integer weekendRates) {
        this.hotelName = hotelName;
        this.weekDayRate = weekDayRate;
        this.weekendRates = weekendRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRate=" + weekDayRate +
                ", weekendRates=" + weekendRates +
                '}';
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(Integer weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public Integer getWeekendRates() {
        return weekendRates;
    }

    public void setWeekendRates(Integer weekendRates) {
        this.weekendRates = weekendRates;
    }
}

