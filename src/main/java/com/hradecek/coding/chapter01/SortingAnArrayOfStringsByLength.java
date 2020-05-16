package com.hradecek.coding.chapter01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 15. Sorting an array of strings by length.
 * <p>
 * Write a program that sorts by the length of the given array of strings.
 */
public class SortingAnArrayOfStringsByLength {

    /**
     * Sorts in-place {@code array} based on length of each string.
     *
     * @param array array to be sorted.
     */
    public static void sortByLength(final String[] array) {
        Arrays.sort(array, Comparator.comparing(String::length));
    }
}
