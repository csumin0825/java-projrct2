package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx_3 {
    Charset charset;

    public ReadFileEx_3(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferReader 선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName,charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) { // readLine한 걸 line에 넣고 line이 null일 때까지 반복
            lines.add(line);
        }
        return lines;
    }

    // FileReader(x)
    public static void main(String[] args) throws IOException {
        ReadFileEx_3 rfe = new ReadFileEx_3(Charset.forName("UTF-8"));
        List<String> result = rfe.getLines("hospital_info_10lines.csv");
        for (int i = 0; i < 9; i++) {
            System.out.println(result.get(i));
        }
    }
}
