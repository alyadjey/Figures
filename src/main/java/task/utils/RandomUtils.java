package utils;
import java.util.Random;

public class RandomUtils {
    private static final Random random = new Random();

    public static int generateRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double generateRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}