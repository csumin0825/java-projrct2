package com.example.codeup;

import java.util.Scanner;

public class codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = sc.next().split(":");
        System.out.printf("%d", Integer.parseInt(sArr[1]));
    }
}
