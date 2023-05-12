package com.example.javaproject2.week4.day5;

import java.io.*;

public class FileInputStreamReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./hospital_info_0920_utf8.csv"),"EUC_KR"));
        System.out.println(br.readLine());
    }
}
