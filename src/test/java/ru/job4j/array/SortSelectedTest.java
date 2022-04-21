package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf3Elements() {
        int[] data = {2, 12, 1};
        int[] expected = {1, 2, 12};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5Elements() {
        int[] data = {34, 12, 45, 3, 8};
        int[] expected = {3, 8, 12, 34, 45};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf10Elements() {
        int[] data = {12, 45, 2, -6, -9, 62, 19, 28, -12, 33};
        int[] expected = {-12, -9, -6, 2, 12, 19, 28, 33, 45, 62};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }
}