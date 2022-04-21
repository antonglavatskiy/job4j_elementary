package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = {2, 23, 12};
        int expected = 2;
        int result = Min.findMin(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {3, 2, 13};
        int expected = 2;
        int result = Min.findMin(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = {12, 7, 3};
        int expected = 3;
        int result = Min.findMin(array);
        Assert.assertEquals(expected, result);
    }
}