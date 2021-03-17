package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int m = 0; m < data.length; m++) {
            if (data[0] != data[m]) {
                return false;
            }
        }
        return true;
    }
}
