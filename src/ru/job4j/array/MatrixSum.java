package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int line = 0; line < array.length; line++) {
            for (int stage = 0; stage < array[line].length; stage++) {
                rsl += array[line][stage];
            }
        }
        return rsl;
    }
}
