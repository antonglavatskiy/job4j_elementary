package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2then2() {
        double p = 6;
        double k = 2;
        double excepted = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenP8K2dot5then2() {
        double p = 8;
        double k = 2.5;
        double excepted = 3.26;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenP4dot5K1dot5then2() {
        double p = 4.5;
        double k = 1.5;
        double excepted = 1.21;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }
}