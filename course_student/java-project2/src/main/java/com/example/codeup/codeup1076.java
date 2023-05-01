package com.example.codeup;

import java.util.Scanner;

public class codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char val = sc.next().charAt(0);
        for (int i = 97; i <= val; i++) {
            System.out.println((char)i);
        }
    }
}
