package com.example.javaproject2.week3.day1;

public class NewSwitchCaseeDaysOfMonth {
    public static void main(String[] args) throws IllegalAccessException {
        int month = 11;
        int lastdate = switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalAccessException("잘못된 월:"+month);
        };
        System.out.println(lastdate);
    }
}
