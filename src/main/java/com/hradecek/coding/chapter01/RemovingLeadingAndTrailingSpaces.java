package com.hradecek.coding.chapter01;

/**
 * 21. Removing leading and trailing spaces.
 * <p>
 * Write a program that removes the leading and trailing spaces of the given string.
 */
public class RemovingLeadingAndTrailingSpaces {

    /**
     * Remove leading and trailing spaces from {@code string}.
     *
     * @param string string to be stripped of leading and trailing spaces
     * @return string without leading and trailing spaces
     */
    public static String strip(final String string) {
        return string.trim();
    }
}
