package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(board, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] board = {
                {'X', ' ', 'X'},
                {' ', 'X', ' '},
                {' ', 'X', 'X'},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(board, row);
        Assert.assertFalse(result);
    }
}