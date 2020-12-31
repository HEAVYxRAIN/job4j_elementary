package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        int x = 180 - 100;
        double rsl = x * 1.15;
        return rsl;
    }

    public static double womanWeight(short height2) {
        int x = 150 - 110;
        double rsl = x * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        System.out.println("Man 180 sm is " + man + "kg");
        short height2 = 150;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 150 sm is " + woman + "kg");
    }

}
