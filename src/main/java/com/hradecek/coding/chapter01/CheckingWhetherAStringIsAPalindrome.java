package com.hradecek.coding.chapter01;

/**
 * 11. Checking whether a string is a palindrome.
 * <p>
 * Write a program that determines whether the given string is a palindrome or not.
 */
public class CheckingWhetherAStringIsAPalindrome {

    /**
     * Check whether {@code string} is a palindrome.
     *
     * @param string input string
     * @return true if {@code string} is a palindrome,
     *         false otherwise.
     */
    public static boolean isPalindrome(final String string) {
        return string.equals(reverse(string));
    }

    private static String reverse(final String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
