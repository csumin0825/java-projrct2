package com.example.codeup;

import java.util.Scanner;

public class codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int min = sc.nextInt();

        for (int i = 0; i < size - 1; i++) {
            int num = sc.nextInt();
            if (num < min) min = num;
        }
        System.out.println(min);
    }
}
