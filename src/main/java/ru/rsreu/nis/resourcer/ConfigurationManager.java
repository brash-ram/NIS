package ru.rsreu.nis.resourcer;

import java.util.ResourceBundle;

public class ConfigurationManager {
    private final static ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.text_ru_RU");

    private ConfigurationManager() {}

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
