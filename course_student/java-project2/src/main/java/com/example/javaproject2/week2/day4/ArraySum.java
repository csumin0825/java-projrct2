package com.example.javaproject2.week2.day4;

public class ArraySum {
    public static void main(String[] args) {
        int answer = 0;
        int[] arr = {2,1,7,4};
        System.out.println(arr[0]);

        answer = answer + arr[0];
        answer = answer + arr[1];
        answer = answer + arr[2];
        answer = answer + arr[3];

        System.out.printf("%d" ,answer);
    }
}
