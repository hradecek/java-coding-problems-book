package com.hradecek.coding.chapter01;

/**
 * 4. Checking whether a string contains only digits.
 * <p>
 * Write a program that checks whether the given string contains only digits.
 */
public class CheckingWhetherAStringContainsOnlyDigits {

    /**
     * Check whether {@code string} contains only digits.
     *
     * @param string input string
     * @return true if {@code string} contains only digits,
     *         false otherwise.
     */
    public static boolean containsOnlyDigits(final String string) {
        return string.matches("\\d+");
    }
}
