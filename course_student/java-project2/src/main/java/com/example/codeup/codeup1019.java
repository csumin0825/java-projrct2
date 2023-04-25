package com.example.codeup;

import java.util.Scanner;

public class codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();

        String[] valArr = val.split("\\.");
        int year = Integer.parseInt(valArr[0]);
        int month = Integer.parseInt(valArr[1]);
        int day = Integer.parseInt(valArr[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
