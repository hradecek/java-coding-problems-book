package com.hradecek.coding.chapter01;

/**
 * 6. Counting occurrences of a certain character
 * <p>
 * Write a program that counts the occurrences of a certain character in a given string.
 */
public class CountingOccurrencesOfCertainCharacter {

    /**
     * Count occurrence of {@code character} found in {@code string}.
     *
     * @param character character to be counted
     * @param string input string
     * @return count of {@code character} in {@code string}
     */
    public static long countCharOccurrence(char character, final String string) {
        return string.codePoints()
                     .mapToObj(ch -> (char) ch)
                     .filter(ch -> ch == character)
                     .count();
    }
}
