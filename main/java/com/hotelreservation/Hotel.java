package com.hotelreservation;

import java.util.Scanner;

public class Hotel {
    String hotelName;
    Integer regularCustomerRate;
    Integer rewardCustomerRate;

    public Hotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hotel Name");
        hotelName = sc.next();
        System.out.println("Enter the Normal Customer Rate");
        regularCustomerRate = sc.nextInt();
        System.out.println("Enter the Reward Customer Rate");
        rewardCustomerRate = sc.nextInt();

    }

    public Hotel(String hotelName, Integer regularCustomerRate, Integer rewardCustomerRate) {
        this.hotelName = hotelName;
        this.regularCustomerRate = regularCustomerRate;
        this.rewardCustomerRate = rewardCustomerRate;
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

    public Integer getRewardCustomerRate() {
        return rewardCustomerRate;
    }

    public void setRewardCustomerRate(Integer rewardCustomerRate) {
        this.rewardCustomerRate = rewardCustomerRate;
    }

}

