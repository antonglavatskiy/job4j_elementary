package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas7Then3() {
        int[] data = {2, 6, 3, 7, 5, 9, 1};
        int element = 7;
        int expected = 3;
        int result = FindLoop.indexOf(data, element);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot100ThenMinus1() {
        int[] data = {12, 26, 43, 17, 65, 99, 13};
        int element = 100;
        int expected = -1;
        int result = FindLoop.indexOf(data, element);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then4() {
        int[] data = {4, 6, 8, 7, 5, 9, 3};
        int element = 5;
        int expected = 4;
        int result = FindLoop.indexOf(data, element);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRangeHas14Then4() {
        int[] data = {11, 3, 5, 23, 14, 32, 1, 7, 9, 4, 5};
        int start = 2;
        int finish = 6;
        int element = 14;
        int expected = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRangeHasNot2ThenMinus1() {
        int[] data = {11, 3, 5, 23, 14, 32, 1, 7, 9, 4, 5};
        int start = 1;
        int finish = 3;
        int element = 2;
        int expected = -1;
        int result = FindLoop.indexInRange(data, element, start, finish);
        Assert.assertEquals(expected, result);
    }
}