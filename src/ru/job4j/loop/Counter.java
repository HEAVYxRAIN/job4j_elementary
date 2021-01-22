package ru.job4j.loop;

public class Counter {
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int even = start; even <= finish; even++) {
            if (even % 2 == 0) {
                sum = sum + even;
            }
        }
        return sum;
    }
}
