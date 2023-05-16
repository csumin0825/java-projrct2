package com.example.javaproject2.week5.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println(br.read());
    }
}
