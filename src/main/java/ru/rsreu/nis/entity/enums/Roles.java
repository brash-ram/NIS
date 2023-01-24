package ru.rsreu.nis.entity.enums;

import java.util.ArrayList;
import java.util.List;

public enum Roles {
    ADMIN("Администратор"),
    MODERATOR("Модератор"),
    DRIVER("Водитель"),
    PASSENGER("Пассажир");

    private String role;

    Roles(String role) {
        this.role = role;
    }

    public String getRussianName() {
        return role;
    }

    public static List<Roles> getAllRoles() {
        return List.of(ADMIN, MODERATOR, DRIVER, PASSENGER);
    }
}
