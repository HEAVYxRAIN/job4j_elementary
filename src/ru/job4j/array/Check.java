package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int m = 0; m < data.length - 1; m++) {
            if (data[0] != data[m]) {
                break;
            }
        }
        return true;
    }
}
