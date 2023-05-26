package com.example.javaproject2.week6.day5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        String firstOtem = this.getFirstItem(stringList);
    }

    public <T> T getFirstItem(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
