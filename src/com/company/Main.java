package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = arrayUtils.createArray(7);
        arrayUtils.printArray(array);
        arrayUtils.printArray(arrayUtils.processArray(array));
    }
}
