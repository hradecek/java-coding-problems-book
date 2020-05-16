package com.hradecek.coding.chapter01;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 14. Finding the character with the most appearances.
 * <p>
 * Write a program that finds the character with the most appearances in the given string.
 */
public class FindingTheCharacterWithTheMostAppearances {

    /**
     * Get set of character with the highest appearance in the {@code string}.
     *
     * @param string input string
     * @return set of characters
     */
    public static Set<Character> highestAppearance(final String string) {
        var appearances = getAppearances(string);
        var max = appearances.values().stream().mapToLong(n -> n).max();

        return max.isPresent() ? getAllWithValue(max.getAsLong(), appearances) : Collections.emptySet();
    }

    private static Map<Character, Long> getAppearances(final String string) {
        return string.codePoints()
                     .mapToObj(ch -> (char) ch)
                     .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
    }

    private static Set<Character> getAllWithValue(long value, Map<Character, Long> appearances) {
        return appearances.entrySet()
                          .stream()
                          .filter(entry -> entry.getValue() == value)
                          .map(Map.Entry::getKey)
                          .collect(Collectors.toSet());
    }
}
