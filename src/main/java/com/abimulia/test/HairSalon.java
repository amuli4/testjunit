package com.abimulia.test;

import java.util.Arrays;

import com.abimulia.Calculator;

public class HairSalon {
    // private String[] openingDays = {"Monday","Tuesday"};
    private int haircutPrice = 30;
    private Calculator calculator = new Calculator();

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    private Day[] openingDays = {Day.MONDAY,Day.TUESDAY};

    // public String[] getOpeningDays(){
    public Day[] getOpeningDays(){
        // return new String[]{};
        return openingDays;
    }

    // public boolean isOpen(String weekDay){
    //     if (!weekDay.endsWith("day")) {
    //         throw new IllegalArgumentException("The weekday argument must end in the letter 'day'");
    //     }
    //     if (weekDay.equals("Monday")||weekDay.equals("Tuesday")) {
    //         return true;
    //     }
    //     return false;
    // }
    public boolean isOpen(Day weekDay){
        if(Arrays.asList(openingDays).contains(weekDay)){
            return true;
        } else {
            return false;
        }

    }


    public int getHaircutPrice(){
        return haircutPrice;
    }

    public int applyDiscount(){
        return calculator.divide(haircutPrice, 2)+5;
    }
}
