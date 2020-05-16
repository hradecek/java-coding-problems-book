package com.hradecek.coding.chapter01;

import java.util.stream.Collector;

/**
 * 8. Removing white spaces from a string
 * <p>
 * Write a program that removes all white spaces from the given string.
 */
public class RemovingWhitespacesFromAString {

    /**
     * Remove all whitespaces from {@code string}.
     *
     * @param string input string
     * @return {@code string} without whitespaces
     */
    public static String removeWhitespaces(final String string) {
        return string.codePoints()
                     .mapToObj(ch -> (char) ch)
                     .filter(ch -> !Character.isWhitespace(ch))
                     .collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append,
                                           StringBuilder::toString));
    }
}
