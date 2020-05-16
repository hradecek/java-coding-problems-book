package com.hradecek.coding.chapter01;

import java.util.Set;
import java.util.function.Predicate;

/**
 * 5. Counting vowels and consonants.
 * <p>
 * Write a program that counts the number of vowels and consonants in a given string.
 * Do this for the English language, which has five vowels (a, e, i, o, and u).
 */
public class CountingVowelsAndConsonants {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'u', 'o');

    /**
     * Return {@link CharCounts}.
     *
     * @param string input string
     * @return final CharCounts
     */
    public static CharCounts getCharCounts(final String string) {
        return new CharCounts(countVowels(string), countConsonants(string));
    }

    /**
     * Get number of consonants found in {@code string}.
     *
     * @param string input string
     * @return number of consonants
     */
    public static long countConsonants(final String string) {
        return countChars(string, CountingVowelsAndConsonants::isConsonant);
    }

    /**
     * Get number of vowels found in {@code string}.
     *
     * @param string input string
     * @return number of vowels
     */
    public static long countVowels(final String string) {
        return countChars(string, CountingVowelsAndConsonants::isVowel);
    }

    private static long countChars(final String string, Predicate<Character> predicate) {
        return string.codePoints()
                     .mapToObj(ch -> (char) ch)
                     .filter(predicate)
                     .count();
    }

    private static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }

    private static boolean isVowel(char ch) {
        return VOWELS.contains(ch);
    }

    public static class CharCounts {
        private final long vowels;
        private final long consonants;

        public CharCounts(long vowels, long consonants) {
            this.vowels = vowels;
            this.consonants = consonants;
        }

        public long getVowels() {
            return vowels;
        }

        public long getConsonants() {
            return consonants;
        }
    }
}
