package dev.omedia;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        String numStr = String.valueOf(number);
        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }
}