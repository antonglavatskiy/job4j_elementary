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

    @Test
    public void whenHasMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(board, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] board = {
                {' ', 'X', ' '},
                {' ', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(board, column);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] expected = {'X', 'X', 'X'};
        char[] result = MatrixCheck.extractDiagonal(board);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] board = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] expected = {'1', '1', '1'};
        char[] result = MatrixCheck.extractDiagonal(board);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] expected = {'X', 'Y', 'Z'};
        char[] result = MatrixCheck.extractDiagonal(board);
        Assert.assertArrayEquals(expected, result);
    }
}