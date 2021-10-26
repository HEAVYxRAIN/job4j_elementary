package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort9Numbers() {
        int[] data = new int[]{9, 3, 8, 4, 1, 2, 6, 5, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort4Numbers() {
        int[] data = new int[]{3, 1, 2, -1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-1, 1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }
}