package com.example.codeup;

import java.util.Scanner;

public class codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = sc.next().split("\\.");
        int year = Integer.parseInt(sArr[0]);
        int month = Integer.parseInt(sArr[1]);
        int day = Integer.parseInt(sArr[2]);

        System.out.printf("%02d-%02d-%04d",day,month,year);
    }
}
