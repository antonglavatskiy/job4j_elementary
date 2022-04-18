package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumNumbersFrom0To5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromNeg12To9ThenNeg33() {
        int start = -12;
        int finish = 9;
        int expected = -33;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromNeg2To0ThenNeg3() {
        int start = -2;
        int finish = 0;
        int expected = -3;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromNeg11To12Then12() {
        int start = -11;
        int finish = 12;
        int expected = 12;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromNeg7To0ThenNeg12() {
        int start = -7;
        int finish = 0;
        int expected = -12;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }
}