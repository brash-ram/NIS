package ru.rsreu.nis.enums;

public enum Jsp {
    LOGIN("/jsp/login.jsp"),
    USER_INFO("/jsp/userInfo.jsp"),
    DRIVER_PROFILE("/jsp/driver/driverProfile.jsp"),
    CREATE_TRIP("/jsp/driver/createTrip.jsp"),
    APPROVE_PASSENGER("/jsp/driver/approvePassenger.jsp"),
    TRIP_PARAMETERS("/jsp/tripParameters.jsp"),
    CERTAIN_TRIP_REQUESTS("/jsp/driver/certainTripRequests.jsp"),
    TRIPS_INFO("/jsp/driver/tripsInfo.jsp"),


    PASSENGER_PROFILE("/jsp/passenger/passengerProfile.jsp"),
    CREATE_REQUEST("/jsp/passenger/createRequest.jsp"),
    MARKS("/jsp/marks.jsp"),
    RATE_DRIVER("/jsp/passenger/rateDriver.jsp"),
    ACTIVE_REQUESTS("/jsp/passenger/activeRequests.jsp"),
    HISTORY_REQUESTS("/jsp/passenger/requestsHistory.jsp"),



    ADMIN_PROFILE("/jsp/admin/adminProfile.jsp"),
    ADD_USER("/jsp/admin/addUser.jsp"),
    USER_LIST("/jsp/userList.jsp"),

    MODER_PROFILE("/jsp/moder/moderProfile.jsp"),
    TRIP_LIST("/jsp/moder/tripList.jsp"),
    REQUEST_LIST("/jsp/moder/requestList.jsp"),
    NOT_FOUND("/pages/404.jsp"),

    REDIRECT("/templates/redirect.jsp");

    private final String route;

    Jsp(String route) {
        this.route = route;
    }

    public String getRoute() {
        return this.route;
    }
}
