package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int number = new Random().nextInt(10000);
        System.out.println(number);
        System.out.println(calculate(number));
    }

    public static int calculate(int number) {
        return (number % 10) * ((number >= 10) ? calculate(number / 10) : 1);
    }
}
