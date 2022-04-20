package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwapBorder() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 2, 3, 4, 5, 1};
        int[] result = SwitchArray.swapBorder(array);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3To5() {
        int[] array = {3, 5, 2, 7, 11, 6, 10, 9};
        int source = 3;
        int dest = 5;
        int[] expected = {3, 5, 2, 6, 11, 7, 10, 9};
        int[] result = SwitchArray.swap(array, 3, 5);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5To1() {
        int[] array = {23, 52, 24, 17, 11, 16, 10, 9};
        int source = 5;
        int dest = 1;
        int[] expected = {23, 16, 24, 17, 11, 52, 10, 9};
        int[] result = SwitchArray.swap(array, 5, 1);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3To3() {
        int[] array = {9, 11, 33, 21, 13, 17, 5, 2};
        int source = 3;
        int dest = 3;
        int[] expected = {9, 11, 33, 21, 13, 17, 5, 2};
        int[] result = SwitchArray.swap(array, 3, 3);
        Assert.assertArrayEquals(expected, result);
    }
}