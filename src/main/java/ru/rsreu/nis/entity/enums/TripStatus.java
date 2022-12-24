package ru.rsreu.nis.entity.enums;

public enum TripStatus {
    COMPLETED("COMPLETED"),
    NOT_COMPLETED("NOT_COMPLETED"),
    IN_WAITING("IN_WAITING");

    private String status;

    TripStatus(String status) {
        this.status = status;
    }

    public String getRussianName() {
        switch (status) {
            case "COMPLETED": return "Завершена";
            case "NOT_COMPLETED": return "Не завершена";
            case "IN_WAITING": return "В ожидании";
        }
        return null;
    }
}
