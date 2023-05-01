package com.example.codeup;

import java.util.Scanner;

public class codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char val = sc.next().charAt(0);
        for (int i = 0; val != 'q'; i++) {
            System.out.println(val);
            val = sc.next().charAt(0);
        }
        System.out.println(val);
    }
}
