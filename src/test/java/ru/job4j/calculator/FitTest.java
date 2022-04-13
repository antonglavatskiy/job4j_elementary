package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan185Then97dot74() {
        short in = 185;
        double expected = 97.74;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman167Then65dot55() {
        short in = 167;
        double excepted = 65.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(excepted, out, 0.01);
    }
}