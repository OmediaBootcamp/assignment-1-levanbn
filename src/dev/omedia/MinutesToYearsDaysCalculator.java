package dev.omedia;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long year = minutes / (365 * 24 * 60);
        long day = (minutes % (365 * 24 * 60)) / (24 * 60);
        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
}
