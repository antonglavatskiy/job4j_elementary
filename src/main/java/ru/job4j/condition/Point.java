package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 0);
        double distanceAB = pointA.distance(pointB);
        System.out.println("result (0, 0) to (2, 0) " + distanceAB);
        Point pointC = new Point(-5, 3);
        Point pointD = new Point(10, 3);
        double distanceCD = pointC.distance(pointD);
        System.out.println("result (-5, 3) to (10, 3) " + distanceCD);
        Point pointE = new Point(2, -3);
        Point pointF = new Point(-7, 1);
        double distanceEF = pointE.distance(pointF);
        System.out.println("result (2, -3) to (-7, 1) " + distanceEF);
    }
}
