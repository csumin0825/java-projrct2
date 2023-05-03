package com.example.codeup;

import java.util.Scanner;

public class codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int add = sc.nextInt();
        int num = sc.nextInt();

        while(num != 1) {
            first += add;
            num--;
        }
        System.out.println(first);
    }
}
