package com.example.codeup;

import java.util.Scanner;

public class codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octalNum = sc.next();
        int decimalNum = Integer.parseInt(octalNum, 8);
        System.out.println(decimalNum);
    }
}
