package com.hradecek.coding.chapter01;

/**
 * 9. Joining multiple strings with a delimiter.
 * <p>
 * Write a program that joins the given strings by the given delimiter.
 */
public class JoiningMultipleStringsWithADelimiter {

    /**
     * Join {@code strings} delimited by {@code delimiter}.
     *
     * @param delimiter delimiter for strings
     * @param strings string to be joint
     * @return joint {@code strings} delimited by {@code delimiter}
     */
    public String join(char delimiter, String... strings) {
        return String.join(String.valueOf(delimiter), strings);
    }
}
