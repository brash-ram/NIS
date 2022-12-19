package ru.rsreu.nis.enums;

public enum Route {
    LOGIN("/login"),
    USERS("/users"),
    MY_TRIPS("/my-trips"),
    MY_REQUESTS("/my_requests"),
    NOT_FOUND("404");

    private final String route;

    Route(String route) {
        this.route = route;
    }

    public String getRelative() {
        return this.route;
    }

    public String getAbsolute() {
        return this.route.substring(1);
    }
}
