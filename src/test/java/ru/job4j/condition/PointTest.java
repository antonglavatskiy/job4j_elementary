package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double excepted = 2;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, rsl, 0.01);
    }

    @Test
    public void when25to10then5dot09() {
        int x1 = 2;
        int y1 = 5;
        int x2 = 1;
        int y2 = 0;
        double excepted = 5.09;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, rsl, 0.01);
    }

    @Test
    public void when34to78then5dot65() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 7;
        int y2 = 8;
        double excepted = 5.65;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, rsl, 0.01);
    }

    @Test
    public void when22to08then6dot32() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 0;
        int y2 = 8;
        double excepted = 6.32;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, rsl, 0.01);
    }

    @Test
    public void whenNeg5Neg7to3Neg9then8dot24() {
        int x1 = -5;
        int y1 = -7;
        int x2 = 3;
        int y2 = -9;
        double excepted = 8.24;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, rsl, 0.01);
    }
}