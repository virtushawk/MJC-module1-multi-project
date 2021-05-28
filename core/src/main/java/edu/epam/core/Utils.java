package edu.epam.core;

import edu.epam.utils.StringUtils;

import java.util.Arrays;

public final class Utils {

    private Utils() {
        throw new UnsupportedOperationException("Object of this class could not be instantiated");
    }

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
