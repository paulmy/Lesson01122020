package com.example.lesson23;

public class Matrix {
    public static int[][] createMatrix(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public static String matrixToString(int[][] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
