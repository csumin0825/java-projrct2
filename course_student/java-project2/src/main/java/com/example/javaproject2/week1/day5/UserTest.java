package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User sumin = new User();
        sumin.name = "최수민";
        sumin.phoneNumber = "010-3324-4946";
        sumin.age = 22;

        User jaesung = new User();
        jaesung.name = "재성 매니저";
        jaesung.phoneNumber = "010-1234-5678";
        jaesung.age = 24;

        System.out.printf("%s님은 어른입니까? %s\n", sumin.name, sumin.isAdult());
        System.out.printf("%s님은 어른입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
