package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {

    @Test
    public void when3on3() {
        int size = 3;
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        int[][] result = Matrix.multiple(size);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when7on7() {
        int size = 7;
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7},
                {2, 4, 6, 8, 10, 12, 14},
                {3, 6, 9, 12, 15, 18, 21},
                {4, 8, 12, 16, 20, 24, 28},
                {5, 10, 15, 20, 25, 30, 35},
                {6, 12, 18, 24, 30, 36, 42},
                {7, 14, 21, 28, 35, 42, 49}
        };
        int[][] result = Matrix.multiple(size);
        Assert.assertArrayEquals(expected, result);
    }
}