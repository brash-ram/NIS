package ru.rsreu.nis.entity.enums;

public enum RequestStatus {
    APPROVED("Одобрена"),
    NOT_APPROVED("Отклонена"),
    IN_WAITING("В ожидании");

    private final String name;

    RequestStatus(String name) {
        this.name = name;
    }

    public String getRussianName() {
        return name;
    }
}
