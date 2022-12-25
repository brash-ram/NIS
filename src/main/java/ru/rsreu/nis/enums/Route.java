package ru.rsreu.nis.enums;

public enum Route {
    LOGIN("/login"),
    USERS("/users"),
    USER_INFO("/userInfo"),
    DRIVER_PROFILE("/driverProfile"),
    CREATE_TRIP("/createTrip"),
    APPROVE_PASSENGER("/approvePassenger"),
    RATE_PASSENGER("/ratePassenger"),
    TRIP_PARAMETERS("/tripParameters"),
    TRIPS_INFO("/tripsInfo"),

    PASSENGER_PROFILE("/passengerProfile"),
    CREATE_REQUEST("/createRequest"),
    MARKS("/marks"),
    RATE_DRIVER("/rateDriver"),
    ACTIVE_REQUESTS("/activeRequests"),

    ADMIN_PROFILE("/adminProfile"),
    ADD_USER("/addUser"),
    USER_LIST("/userList"),

    MODER_PROFILE("/moderProfile"),
    TRIP_LIST("/tripList"),
    REQUEST_LIST("/requestList"),
    LOGOUT("/login"),
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
