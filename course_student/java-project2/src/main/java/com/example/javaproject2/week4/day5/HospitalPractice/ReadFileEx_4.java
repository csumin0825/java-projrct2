package com.example.javaproject2.week4.day5.HospitalPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx_4 {
    Charset charset;

    public ReadFileEx_4(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferReader 선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) { // readLine한 걸 line에 넣고 line이 null일 때까지 반복
            lines.add(line);
        }
        return lines;
    }

    private Hospital parse(String str) {
        System.out.println(str);
        String[] splited = str.split(","); // split한 후
        System.out.println(Arrays.toString(splited)); // Array를 출력
        System.out.println(splited[1]);
        Address address = new Address("", "", "");
        Hospital hospital = new Hospital("", "", address);
        return hospital;
    }

    // FileReader(x)
    public static void main(String[] args) throws IOException {
        ReadFileEx_4 rfe = new ReadFileEx_4(Charset.forName("UTF-8"));
        List<String> result = rfe.getLines("hospital_info_10lines.csv");
        rfe.parse(result.get(0));
    }
}
