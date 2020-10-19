package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (array[i] % 2 != 0) {
                array[i]++;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] * array[i - 1] + " ");
        }
    }
}
