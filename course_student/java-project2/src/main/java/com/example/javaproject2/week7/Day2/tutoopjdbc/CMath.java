package com.example.javaproject2.week7.Day2.tutoopjdbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CMath {
    public static void main(String[] args) {
        isPrime(7);
        prime(10);
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean perfectionNum(int num) {
        int result = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) result += i;
        }
        return (result == num) ? true : false;
    }

    public static String prime(int num){
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if(num%i==0) arr.add(i);
        }
        return arr.toString();
    }
}
