package com.hradecek.coding.chapter01;

/**
 * 25. Computing the minimum and maximum of two numbers.
 * <p>
 * Write a program that returns the minimum and maximum of two numbers.
 */
public class ComputingTheMinimumAndMaximumOfTwoNumbers {

    /**
     * Returns minimal and maximal value of {@code number1} and {@code number2}.
     *
     * @param number1 first number to be compared
     * @param number2 second number to be compared
     * @param <T> must be number and comparable
     * @return Minimal and maximal value
     */
    public static <T extends Number & Comparable<T>> MinMax<T> minMax(T number1, T number2) {
        return new MinMax<>(min(number1, number2), max(number1, number2));
    }

    private static <T extends Comparable<T>> T min(T first, T second) {
        return first.compareTo(second) < 0 ? first : second;
    }

    private static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    /**
     * Aggregates minimum and maximum.
     *
     * @param <T> type of the aggregated numbers
     */
    public static class MinMax<T extends Number & Comparable<T>> {

        private final T min;
        private final T max;

        /**
         * Constructor.
         *
         * @param min minimum
         * @param max maximum
         */
        public MinMax(T min, T max) {
            this.min = min;
            this.max = max;
        }

        /**
         * Get minimum.
         *
         * @return minimum
         */
        public T getMin() {
            return min;
        }

        /**
         * Get maximum.
         *
         * @return maximum
         */
        public T getMax() {
            return max;
        }
    }
}
