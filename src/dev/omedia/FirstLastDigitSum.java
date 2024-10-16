package dev.omedia;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int numberDuplicate = number;
        while (numberDuplicate >= 10) {
            numberDuplicate /= 10;
        }
        return numberDuplicate + number % 10;
    }
}
