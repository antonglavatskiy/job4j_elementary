package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {10, 4, 5, 13, 8};
        int start = 1;
        int finish = 3;
        int expected = 4;
        int result = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 3, 8, 11, 7};
        int start = 0;
        int finish = 2;
        int expected = 3;
        int result = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {7, 12, 4, 3, 5, 8};
        int start = 1;
        int finish = 3;
        int expected = 3;
        int result = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, result);
    }
}