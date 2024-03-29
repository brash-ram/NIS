package ru.rsreu.nis.enums;

public enum Route {
    LOGIN("/login"),
    USERS("/users"),
    USER_INFO("/userInfo"),
    DRIVER_PROFILE("/driverProfile"),
    CREATE_TRIP("/createTrip"),
    APPROVE_PASSENGER("/approvePassenger"),
    DISAPPROVE_PASSENGER("/disapprovePassenger"),
    TRIP_PARAMETERS("/tripParameters"),
    TRIPS_INFO("/tripsInfo"),

    PASSENGER_PROFILE("/passengerProfile"),
    CREATE_REQUEST("/createRequest"),
    MARKS("/marks"),
    RATE_DRIVER("/rateDriver"),
    ACTIVE_REQUESTS("/activeRequests"),
    REQUESTS_HISTORY("/requestsHistory"),

    ADMIN_PROFILE("/adminProfile"),
    ADD_USER("/addUser"),
    USER_LIST("/userList"),

    MODER_PROFILE("/moderProfile"),
    TRIP_LIST("/tripList"),
    REQUEST_LIST("/requestList"),
    LOGOUT("/logout"),
    CHANGE_USER("/changeUser"),
    DELETE_USER("/deleteUser"),
    BLOCK_USER("/blockUser"),
    UNBLOCK_USER("/unblockUser"),
    DELETE_TRIP("/deleteTrip"),
    COMPLETE_TRIP("/completeTrip"),
    MY_REQUESTS("/my_requests"),
    CREATE_MARK("/createMark"),
    PASSENGER_LIST("/passengerList"),
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
