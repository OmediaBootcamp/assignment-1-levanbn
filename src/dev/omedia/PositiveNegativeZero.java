package dev.omedia;

public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println((number > 0) ? "positive" : "negative");
        }
    }
}