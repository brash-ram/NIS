package ru.rsreu.nis.utils;

public class StringUtils {
    public static String capitalize(String substring) {
        return substring.substring(0, 1).toUpperCase() + substring.substring(1);
    }
}
