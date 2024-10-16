package dev.omedia;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        long first1 = (long) (first * 1000);
        long second1 = (long) (second * 1000);
        return first1 == second1;
    }
}