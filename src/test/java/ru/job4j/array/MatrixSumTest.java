package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] array = {{5}};
        int expected = 5;
        int result = MatrixSum.sum(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {{5, 3}, {3, 4}};
        int expected = 15;
        int result = MatrixSum.sum(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int expected = 36;
        int result = MatrixSum.sum(array);
        Assert.assertEquals(expected, result);
    }
}