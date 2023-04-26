package com.example.javaproject2.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillRow {

    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        arr[val][0] = 1;
        arr[val][1] = 1;
        arr[val][2] = 1;
        arr[val][3] = 1;
        arr[val][4] = 1;

        printArray(arr);
    }
}
