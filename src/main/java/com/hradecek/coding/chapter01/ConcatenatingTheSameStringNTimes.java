package com.hradecek.coding.chapter01;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 20. Concatenating the same string n times.
 * <p>
 * Write a program that concatenates the same string a given number of times.
 */
public class ConcatenatingTheSameStringNTimes {

    /**
     * Concatenate {@code string} n-{@code times}.
     * <p>
     * <em>JDK-11</em>: Same result as {@link String#repeat(int)}.
     *
     * @param string string to be concatenated
     * @param times number of concatenations
     * @return concatenated string
     */
    public static String concatenate(String string, int times) {
        return Stream.generate(() -> string).limit(times).collect(Collectors.joining());
    }
}
