package com.example.codeup;

import java.util.Scanner;

public class codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val1 = sc.next();
        System.out.println(val1);

        String[] val2 = val1.split(":");
        System.out.printf("%s:%s", val2[0],val2[1]);
    }
}
