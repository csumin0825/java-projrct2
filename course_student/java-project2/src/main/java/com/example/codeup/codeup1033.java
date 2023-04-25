package com.example.codeup;

import java.util.Scanner;

public class codeup1033 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int decimalNum = sc.nextInt();
        String hexNum = Integer.toHexString(decimalNum);
        System.out.println(hexNum.toUpperCase());


    }
}
