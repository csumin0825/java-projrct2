package com.example.javaproject2.week4.day4;

import java.io.*;

public class ReadFileEx {
    // FileReader(x)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./hospital_info_0920.csv"));
        System.out.println(br.readLine());
    }
}
