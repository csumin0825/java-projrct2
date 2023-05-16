package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx_1 {
    // FileReader(x)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./hospital_info_0920_utf8.csv"));
        System.out.println(br.readLine());
    }
}
