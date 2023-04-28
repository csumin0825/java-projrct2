package com.example.javaproject2.week2.day5;

public class AutoSwap {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 9};
        boolean check = arr[0] > arr[1];
        if (check) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }
}
