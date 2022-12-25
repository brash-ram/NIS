package ru.rsreu.nis.utils;

public class StringUtils {
    public static String capitalize(String substring) {
        return substring.substring(0, 1).toUpperCase() + substring.substring(1);
    }
    public static String concatWithSpace(String str1, String str2) {
        return new StringBuilder().append(str1)
                .append(" ")
                .append(str2)
                .toString();
    }
}
