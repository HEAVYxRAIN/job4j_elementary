package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl =  value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(70);
        System.out.println("70 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(60);
        System.out.println("60 rubles are " + dollar + " dollar.");
    }
}
