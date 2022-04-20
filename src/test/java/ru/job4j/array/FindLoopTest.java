package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas7Then3() {
        int[] data = {2, 6, 3, 7, 5, 9, 1};
        int element = 7;
        int expected = 3;
        int rsl = FindLoop.indexOf(data, element);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenArrayHasNot100ThenMinus1() {
        int[] data = {12, 26, 43, 17, 65, 99, 13};
        int element = 100;
        int expected = -1;
        int rsl = FindLoop.indexOf(data, element);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenArrayHas5Then4() {
        int[] data = {4, 6, 8, 7, 5, 9, 3};
        int element = 5;
        int expected = 4;
        int rsl = FindLoop.indexOf(data, element);
        Assert.assertEquals(expected, rsl);
    }
}