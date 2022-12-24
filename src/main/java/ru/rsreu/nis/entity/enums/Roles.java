package ru.rsreu.nis.entity.enums;

public enum Roles {
    ADMIN("ADMIN"),
    MODERATOR("MODERATOR"),
    DRIVER("DRIVER"),
    PASSENGER("PASSENGER");

    private String  role;

    Roles(String role) {
        this.role = role;
    }

    public String getRussianName() {
        switch (role) {
            case "ADMIN": return "Администратор";
            case "MODERATOR": return "Модератор";
            case "DRIVER": return "Водитель";
            case "PASSENGER": return "Пассажир";
        }
        return null;
    }
}
