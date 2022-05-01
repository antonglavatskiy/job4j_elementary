package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 0);
        double excepted = 2;
        double result = pointA.distance(pointB);
        Assert.assertEquals(excepted, result, 0.01);
    }

    @Test
    public void when25to10then5dot09() {
        Point pointA = new Point(2, 5);
        Point pointB = new Point(1, 0);
        double excepted = 5.09;
        double result = pointA.distance(pointB);
        Assert.assertEquals(excepted, result, 0.01);
    }

    @Test
    public void when34to78then5dot65() {
        Point pointA = new Point(3, 4);
        Point pointB = new Point(7, 8);
        double excepted = 5.65;
        double result = pointA.distance(pointB);
        Assert.assertEquals(excepted, result, 0.01);
    }

    @Test
    public void when22to08then6dot32() {
        Point pointA = new Point(2, 2);
        Point pointB = new Point(0, 8);
        double excepted = 6.32;
        double result = pointA.distance(pointB);
        Assert.assertEquals(excepted, result, 0.01);
    }

    @Test
    public void whenNeg5Neg7to3Neg9then8dot24() {
        Point pointA = new Point(-5, -7);
        Point pointB = new Point(3, -9);
        double excepted = 8.24;
        double result = pointA.distance(pointB);
        Assert.assertEquals(excepted, result, 0.01);
    }
}