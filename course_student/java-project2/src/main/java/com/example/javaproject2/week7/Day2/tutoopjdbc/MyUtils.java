package com.example.javaproject2.week7.Day2.tutoopjdbc;

public class MyUtils {
    public static void game369EX() {
        int cnt = 333;
        String result = game369(cnt);
        System.out.println(cnt + result);
    }

    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static String game369(int num) {
        int a = num / 10;
        int mod = num % 10;

        String str = (mod % 3 == 0 && mod != 0) ? "*" : "";
        if (a == 0) {
            return str;
        }
        return str + game369(a);
    }


}
