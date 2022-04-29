package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNoExist1() {
        double ab = 2.5;
        double ac = 5.0;
        double bc = 8.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNoExist2() {
        double ab = 22.5;
        double ac = 5.0;
        double bc = 8.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNoExist3() {
        double ab = 2.5;
        double ac = 15.0;
        double bc = 8.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}