package com.example.javaproject2.week4.day5.HospitalPractice;

public class Hospital {
    private String name;
    private String websiteAddr;
    private Address adress;

    public Hospital(String name, String websiteAddr, Address adress) {
        this.name = name;
        this.websiteAddr = websiteAddr;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public Address getAdress() {
        return adress;
    }
}
