package dev.omedia;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }
        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
    }

    public static boolean isValid(int n) {
        return (n > 9 && n <= 1000);
    }
}
