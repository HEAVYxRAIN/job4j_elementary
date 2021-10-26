package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(70);
        System.out.println("70 rubles are " + euro + " euro.");
        int in = 70;
        int expected = 1;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("70 rubles are 1. Test result : " + passed);
        int dollar = Converter.rubleToDollar(60);
        System.out.println("60 rubles are " + dollar + " dollar.");
        int in2 = 60;
        int expected2 = 1;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("60 rubles are 1. Test result : " + passed2);
    }
}
