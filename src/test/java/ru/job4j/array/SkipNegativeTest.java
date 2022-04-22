package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SkipNegativeTest {

    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {{2, 5, -3}, {3, -5, 2}, {1, 7, 1}};
        int[][] expected = {{2, 5, 0}, {3, 0, 2}, {1, 7, 1}};
        int[][] result = SkipNegative.skip(array);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {5, 2, -2, -7, 0},
                {3, -9, 2},
                {-3, -8, 1, 5},
                {3, 7}};
        int[][] expected = {
                {5, 2, 0, 0, 0},
                {3, 0, 2},
                {0, 0, 1, 5},
                {3, 7}};
        int[][] result = SkipNegative.skip(array);
        Assert.assertArrayEquals(expected, result);
    }
}