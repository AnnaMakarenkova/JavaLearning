package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Random random = new Random();
        int result = 0;

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                matrix[x][y] = random.nextInt(100);
                if (matrix[x][y] % 5 == 0 && matrix[x][y] % 2 == 1) {
                    result++;
                }
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println(result);
    }
}
