package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int fak = 1; fak <= n; fak++) {
            result = result * fak;
        }
        return result;
    }
}