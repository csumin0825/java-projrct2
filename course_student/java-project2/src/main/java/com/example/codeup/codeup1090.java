package com.example.codeup;

import java.util.Scanner;

public class codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long first = sc.nextLong();
        Long multi = sc.nextLong();
        Long num = sc.nextLong();

        while(num != 1) {
            first *= multi;
            num--;
        }
        System.out.println(first);
    }
}
