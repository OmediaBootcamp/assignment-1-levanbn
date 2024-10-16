package dev.omedia;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            String nextEntry = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextEntry);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (count > 0) {
            average = Math.round((double) sum / count);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
