package util;

public class ValidationUtil {
    private static int LENGTH_LIMIT_UPPER = 5;
    private static int LENGTH_LIMIT_LOWER = 0;
    public static void isCarNameValid(String carName) {
        if (carName.length() > LENGTH_LIMIT_UPPER || carName.length() == LENGTH_LIMIT_LOWER) {
            throw new IllegalArgumentException();
        }
    }
}
