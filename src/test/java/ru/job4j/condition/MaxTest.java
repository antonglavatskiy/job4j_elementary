package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax45To67Then67() {
        int a = 45;
        int b = 67;
        int expected = 67;
        int max = Max.max(a, b);
        Assert.assertEquals(expected, max);
    }

    @Test
    public void whenMax10To7Then10() {
        int a = 10;
        int b = 7;
        int expected = 10;
        int max = Max.max(a, b);
        Assert.assertEquals(expected, max);
    }

    @Test
    public void whenMax13To13Then13() {
        int a = 13;
        int b = 13;
        int expected = 13;
        int max = Max.max(a, b);
        Assert.assertEquals(expected, max);
    }
}