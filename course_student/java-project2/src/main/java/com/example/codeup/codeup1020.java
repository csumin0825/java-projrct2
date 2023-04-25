package com.example.codeup;

import java.util.Scanner;

public class codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        System.out.printf("%s",num.substring(0,6));
        System.out.printf("%s",num.substring(7,14));
    }
}
