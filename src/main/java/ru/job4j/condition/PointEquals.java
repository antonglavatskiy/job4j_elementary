package ru.job4j.condition;

public class PointEquals {
    public  static boolean eq(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }

    public static void main(String[] args) {
        System.out.println(PointEquals.eq(1, 1, 2, 2));
        System.out.println(PointEquals.eq(10, 10, 10, 10));
    }
}
