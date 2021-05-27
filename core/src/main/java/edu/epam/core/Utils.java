package edu.epam.core;

import edu.epam.utils.StringUtils;

public class Utils {

    private Utils() {}

    public static boolean isAllPositiveNumbers(String... str) {
        boolean flag = true;
        for (String number : str) {
            if (!StringUtils.isPositiveNumber(number)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
