package com.hradecek.coding.chapter02;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 40. Checking null references in functional style and imperative code.
 * <p>
 * Write a program that performs the `null` checks on the given references in a functional style and imperative code.
 */
public class CheckingNullReferencesInFunctionalStyleAndImperativeCode {

    /**
     * Check whether passed object is null.
     *
     * @param maybeNull passed object
     * @param <T> type of passed object
     */
    public static <T> void imperativeNullCheck(final T maybeNull) {
        if (null == maybeNull) {
            System.out.println("Passed object was null.");
        } else {
            System.out.println("Passed object was not null.");
        }
    }

    /**
     * Check whether list contains nulls.
     *
     * @param maybeNulls passed list
     * @param <T> type of objects in list
     */
    public static <T> void imperativeNullCheck(final List<T> maybeNulls) {
        if (null == maybeNulls) {
            System.out.println("Passed list was null.");
        } else {
            for (T object : maybeNulls) {
                if (null == object) {
                    System.out.println("Passed list contains null.");
                    return;
                }
            }
            System.out.println("Passed list does not contains null.");
        }
    }

    /**
     * Check whether passed object is null.
     *
     * @param maybeNull passed object
     * @param <T> type of passed object
     */
    public static <T> void functionalNullCheck(final T maybeNull) {
        Optional.ofNullable(maybeNull).ifPresentOrElse(object -> System.out.println("Object was not null"),
                                                       () -> System.out.println("Object was null"));
    }

    /**
     * Check whether list contains nulls.
     *
     * @param maybeNulls passed list
     * @param <T> type of objects in list
     */
    public static <T> void functionalNullCheck(final List<T> maybeNulls) {
        Optional.ofNullable(maybeNulls)
                .filter(list -> list.stream().allMatch(Objects::nonNull))
                .ifPresentOrElse(list -> System.out.println("Passed list does not contains null."),
                                 () -> System.out.println("Passed list contains null."));
    }
}
