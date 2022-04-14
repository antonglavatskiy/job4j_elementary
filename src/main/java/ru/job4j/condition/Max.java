package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int a = 59;
        int b = 71;
        int max = Max.max(a, b);
        System.out.println(max);
    }
}
