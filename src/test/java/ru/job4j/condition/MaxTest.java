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

    @Test
    public void whenMax13To14To15Then15() {
        int a = 13;
        int b = 14;
        int c = 15;
        int expected = 15;
        int max = Max.max(a, b, c);
        Assert.assertEquals(expected, max);
    }

    @Test
    public void whenMax17To14To15Then17() {
        int a = 17;
        int b = 14;
        int c = 15;
        int expected = 17;
        int max = Max.max(a, b, c);
        Assert.assertEquals(expected, max);
    }

    @Test
    public void whenMax23To24To25To26Then26() {
        int a = 23;
        int b = 24;
        int c = 25;
        int d = 26;
        int expected = 26;
        int max = Max.max(a, b, c, d);
        Assert.assertEquals(expected, max);
    }

    @Test
    public void whenMax23To27To25To26Then27() {
        int a = 23;
        int b = 27;
        int c = 25;
        int d = 26;
        int expected = 27;
        int max = Max.max(a, b, c, d);
        Assert.assertEquals(expected, max);
    }
}