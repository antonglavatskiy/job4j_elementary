package ru.job4j.array;

public class PrintEvenElements {
    public static String printEvenInts(int[] numbers) {
        String ln = System.lineSeparator();
        String result = "Элементы массива с чётными индексами, начиная с последнего: " + ln;
        for (int index = 0; index < numbers.length; index++) {
            if ((numbers.length - 1 - index) % 2 == 0) {
                result += numbers[numbers.length - 1 - index] + ln;
            }
        }
        return result;
    }
}
