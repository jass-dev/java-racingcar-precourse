package util;

import java.util.Random;

public class ValidationUtil {
    private static final int LENGTH_LIMIT_UPPER = 5;
    private static final int LENGTH_LIMIT_LOWER = 0;
    private static final int RANDOM_GO_BOUND = 4;
    private static final int RANDOM_BOUND = 10;
    private static final Random random = new Random();

    public static void isCarNameValid(String carName) {
        if (carName.length() > LENGTH_LIMIT_UPPER || carName.length() == LENGTH_LIMIT_LOWER) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean carGoOrStop() {
        return random.nextInt(RANDOM_BOUND) >= RANDOM_GO_BOUND;
    }
}
