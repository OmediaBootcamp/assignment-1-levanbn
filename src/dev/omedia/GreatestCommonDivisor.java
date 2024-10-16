package dev.omedia;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int result = 1;
        int min = Math.min(first, second);
        int max = Math.max(first, second);
        for (int i = 1; i <= min / 2; i++) {
            if (min % i == 0 && max % i == 0) {
                result = i;
            }
        }
        if (max % min == 0) {
            result = min;
        }
        return result;
    }
}
