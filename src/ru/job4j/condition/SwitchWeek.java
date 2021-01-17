package ru.job4j.condition;

import static java.lang.System.*;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскрессенье";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        out.println(SwitchWeek.nameOfDay(1));
        out.println(SwitchWeek.nameOfDay(2));
        out.println(SwitchWeek.nameOfDay(3));
        out.println(SwitchWeek.nameOfDay(4));
        out.println(SwitchWeek.nameOfDay(5));
        out.println(SwitchWeek.nameOfDay(6));
        out.println(SwitchWeek.nameOfDay(7));
        out.println(SwitchWeek.nameOfDay(20));
    }
}
