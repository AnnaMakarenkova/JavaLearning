package com.company;

import java.util.Random;

public class ArrayUtils {

    int[] createArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
        return array;
    }

    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int[] processArray(int[] array) {
        int[] resultArray = new int[array.length / 2];
        for (int i = 1; i < array.length; i += 2) {
            resultArray[i/2] = array[i] * array[i - 1];
        }
        return resultArray;
    }
}
