package com.hradecek.coding.chapter01;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * 3. Reversing letters and words.
 * <p>
 * Write a program that reverses the letters of each word and a program that reverses the letters of each word and the
 * words themselves.
 */
public class ReversingLettersAndWords {

    /**
     * Reverse words and their letters in a {@code sentence}.
     *
     * @param sentence sentence to be reversed
     * @return reversed {@code sentence}
     */
    public static String reverseWords(final String sentence) {
        var reversedWords = Arrays.asList(sentence.split(" +"));
        Collections.reverse(reversedWords);

        return reversedWords.stream().map(ReversingLettersAndWords::reverseLetters).collect(Collectors.joining(" "));
    }

    /**
     * Reverse letters in {@code word}.
     *
     * @param word word, that letters are being reversed
     * @return {@code word} with reversed letters
     */
    public static String reverseLetters(final String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
