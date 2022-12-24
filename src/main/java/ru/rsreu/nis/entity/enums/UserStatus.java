package ru.rsreu.nis.entity.enums;

public enum UserStatus {
    BLOCKED("BLOCKED"),
    NOT_BLOCKED("NOT_BLOCKED");

    private String  status;

    UserStatus(String status) {
        this.status = status;
    }

    public String getRussianName() {
        switch (status) {
            case "BLOCKED": return "Заблокирован";
            case "NOT_BLOCKED": return "Не заблокирован";
        }
        return null;
    }
}
