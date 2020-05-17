package com.hradecek.coding.chapter02;

import java.util.Objects;

/**
 * 41. Checking null references and throwing a customized NullPointerException error.
 * <p>
 * Write a program that performs the null checks on the given references and throws NullPointerException with custom
 * messages.
 */
public class CheckingNullReferencesAndThrowingACustomizedNPEError {

    /**
     * Check whether passed {@code object} is null.
     * <p>
     * If passed {@code object} is null, then {@link NullPointerException} is thrown.
     *
     * @param object passed object
     * @param <T> type of passed object
     */
    public static <T> void nullCheck(T object) {
        Objects.requireNonNull(object, "'object' was null");
        // Do something
    }
}
