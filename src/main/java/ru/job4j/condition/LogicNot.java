package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean isEv = LogicNot.isEven(2);
        System.out.println(isEv);
        boolean isPos = LogicNot.isPositive(2);
        System.out.println(isPos);
        boolean notEv = LogicNot.notEven(2);
        System.out.println(notEv);
        boolean notPos = LogicNot.notPositive(2);
        System.out.println(notPos);
        boolean notEvAndPos = LogicNot.notEvenAndPositive(2);
        System.out.println(notEvAndPos);
        boolean evOrNotPos = LogicNot.evenOrNotPositive(2);
        System.out.println(evOrNotPos);
    }
}
