package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{9}, {8, 7}, {6, 5, 4}, {3, 2, 1, 0}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива: " + array[i].length);
        }
    }
}
