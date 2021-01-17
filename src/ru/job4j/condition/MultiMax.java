package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        } else if (third > first && third > second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int max = MultiMax.max(6, 4, 2);
        System.out.println(max);
    }
}
