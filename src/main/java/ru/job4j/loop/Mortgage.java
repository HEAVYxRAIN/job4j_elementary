package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double credit = amount;
        percent = percent / 100;
        while (credit > 0) {
            credit = credit + credit * percent - salary;
            year++;
        }
        return year;
    }
}
