package dev.omedia;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 9 || b < 9 || a > 100 || b > 100) {
            return false;
        }
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10 || a % 10 == b / 10;
    }
}
