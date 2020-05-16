package com.hradecek.coding.chapter01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 2. Finding the first non-repeated character.
 * <p>
 * Write a program that returns the first non-repeated character from a given string.
 */
public class FindingFirstNonRepeatedCharacter {

    /**
     * Gets first non-repeated character found in {@code string}.
     * <p>
     * If all characters are repeated or {@code string} is empty then {@code Optional.empty()} is returned.
     *
     * @param string input string
     * @return first non-repeated character or {@code Optional.empty()}
     */
    public static Optional<Character> firstNonRepeatedCharacter(final String string) {
        var uniques = new LinkedHashMap<Character, Boolean>();
        for (char ch : string.toCharArray()) {
            uniques.compute(ch, (storedCh, isUnique) -> isUnique == null);
        }

        return getFirst(uniques);
    }

    private static Optional<Character> getFirst(HashMap<Character, Boolean> uniques) {
        return uniques.entrySet().stream().filter(Map.Entry::getValue).map(Map.Entry::getKey).findFirst();
    }
}
