package dev.omedia;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reversedNumber = 0;
        int numberDuplicate = number;

        while (numberDuplicate != 0) {
            reversedNumber = reversedNumber * 10 + numberDuplicate % 10;
            numberDuplicate /= 10;
        }
        return number == reversedNumber;
    }
}
