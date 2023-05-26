package com.example.javaproject2.week6.day5.abstractPrac;

import com.example.javaproject2.week6.day5.abstractPrac.Animal;
import com.example.javaproject2.week6.day5.abstractPrac.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}
