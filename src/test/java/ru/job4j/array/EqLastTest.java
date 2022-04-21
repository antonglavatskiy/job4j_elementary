package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EqLastTest {

    @Test
    public void whenEquals() {
        int[] left = {2, 5, 7, 3};
        int[] right = {1, 3, 3};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEquals() {
        int[] left = {2, 5, 7, 3};
        int[] right = {2, 3, 3, 8};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}