package com.hradecek.coding.chapter01;

import java.lang.reflect.InvocationTargetException;

/**
 * 7. Converting {@code String} into {@code int}, {@code long}, {@code float}, or {@code double}.
 * <p>
 * Write a program that converts the given {@code String} object (representing a number) into:
 * <ul>
 *   <li>{@code int},
 *   <li>{@code long},
 *   <li>{@code float} or
 *   <li>{@code double}.
 * <ul>
 */
public class ConvertingStringIntoNumber {

    /**
     * Converts {@code stringNumber} into number instance of {@code numberClass}.
     *
     * @param stringNumber number in string
     * @param numberClass resulting class
     * @return number {@code stringNumber} converted to {@code numberClass}
     */
    public static Number convert(final String stringNumber, Class<? extends Number> numberClass) {
        if (Integer.class.equals(numberClass)) {
            return Integer.valueOf(stringNumber);
        } else if (Long.class.equals(numberClass)) {
            return Long.valueOf(stringNumber);
        } else if (Double.class.equals(numberClass)) {
            return Double.valueOf(stringNumber);
        } else if (Float.class.equals(numberClass)) {
            return Float.valueOf(stringNumber);
        } else {
            throw new UnsupportedOperationException(String.format("Cannot convert string into '%s'", numberClass));
        }
    }

    /**
     * Converts {@code stringNumber} into number instance of {@code numberClass} using Reflection API.
     *
     * @param stringNumber number in string
     * @param numberClass resulting class
     * @return number {@code stringNumber} converted to {@code numberClass}
     */
    public static Number convertUsingReflection(final String stringNumber, Class<? extends Number> numberClass) {
        try {
            return (Number) numberClass.getDeclaredMethod("valueOf", String.class).invoke(numberClass, stringNumber);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
            throw new UnsupportedOperationException(String.format("Cannot convert string into '%s'", numberClass), ex);
        }
    }
}
