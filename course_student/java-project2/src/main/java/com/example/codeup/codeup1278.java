package com.example.codeup;

import java.util.Scanner;

public class codeup1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        int cnt =1;

        while(val >=10){
            val = val/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
