package ru.rsreu.nis.entity.enums;

public enum SessionStatus {
    AUTHORIZED("AUTHORIZED"),
    NOT_AUTHORIZED("NOT_AUTHORIZED");

    private String  status;

    SessionStatus(String status) {
        this.status = status;
    }

    public String getRussianName() {
        switch (status) {
            case "AUTHORIZED": return "Авторизован";
            case "NOT_AUTHORIZED": return "Не авторизован";
        }
        return null;
    }
}
