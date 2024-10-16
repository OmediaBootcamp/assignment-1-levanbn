package dev.omedia;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int maxPrime = 1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                maxPrime = i;
                number /= i;
                i--;
            }
        }
        return maxPrime;
    }
}
