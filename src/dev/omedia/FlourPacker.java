package dev.omedia;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount * 5 + smallCount < goal) {
            return false;
        }
        int maxBigBagsUsed = Math.min(bigCount, goal / 5);
        int remainingWeight = goal - (maxBigBagsUsed * 5);
        return remainingWeight <= smallCount;
    }
}
