package com.example.javaproject2.week3.day2;

public class WhileCnt {
    public static void main(String[] args) {
        int cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt++);
//            cnt++;
        }
        System.out.println("cnt = " + cnt);
    }
}
