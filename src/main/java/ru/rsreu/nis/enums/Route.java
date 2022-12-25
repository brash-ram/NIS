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
    CERTAIN_TRIP_REQUESTS("/certainTripRequests"),
    TRIPS_INFO("/tripsInfo"),
    PASSENGERS_MARKS("/passengersMarks"),

    PASSENGER_PROFILE("/passengerProfile"),
    CREATE_REQUEST("/createRequest"),
    DRIVER_MARKS("/driverMarks"),
    RATE_DRIVER("/rateDriver"),
    ACTIVE_REQUESTS("/activeRequests"),

    ADMIN_PROFILE("/adminProfile"),
    ADD_USER("/addUser"),
    USER_LIST("/userList"),
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
