package com.example.javaproject2.week3.day4;

public class P120852B {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1];
        int idx = 0;

        while (n > 1) {
            if (n % divisor == 0) {
                arr[idx++] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }
        for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);
    }
}
