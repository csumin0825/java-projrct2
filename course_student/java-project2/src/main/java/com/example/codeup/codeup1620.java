package com.example.codeup;

import java.util.Scanner;

public class codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String val = sc.next();
        int sum = 0;
        while (Integer.parseInt(val) >= 10) {
            sum = 0;
            String[] arr = val.split("");
            for (int i = 0; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }
            val = Integer.toString(sum);
        }
        if (Integer.parseInt(val) < 10) {
            System.out.println(val);
        } else {
            System.out.println(sum);
        }
    }
}
