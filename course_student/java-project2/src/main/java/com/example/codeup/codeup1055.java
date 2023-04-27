package com.example.codeup;

import java.util.Scanner;

public class codeup1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(val1 == 1 || val2 == 1 ? 1:0);
    }
}
