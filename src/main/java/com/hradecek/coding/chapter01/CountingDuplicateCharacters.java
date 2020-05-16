package com.hradecek.coding.chapter01;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1. Counting duplicate characters.
 * <p>
 * Write a program that counts duplicate characters from a given string.
 */
public class CountingDuplicateCharacters {

    /**
     * Counts number of duplicated characters.
     *
     * @param string input string
     * @return Map of characters with count of duplications
     */
    public static Map<Character, Long> duplicateCharacters(final String string) {
        return string.codePoints()
                     .mapToObj(point -> (char) point)
                     .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
    }
}
