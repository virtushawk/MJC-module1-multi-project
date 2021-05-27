package edu.epam.core;

import edu.epam.utils.StringUtils;

import java.util.Arrays;

public final class Utils {

    private Utils() {
        throw new UnsupportedOperationException();
    }

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
