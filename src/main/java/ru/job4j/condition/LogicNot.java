package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean notEven(int number) {
        return !isEven(number);
    }

    public static boolean notPositive(int number) {
        return !isPositive(number);
    }

    public static boolean notEvenAndPositive(int number) {
        return notEven(number) && isPositive(number);
    }

    public static boolean evenOrNotPositive(int number) {
        return isEven(number) || notPositive(number);
    }
}
