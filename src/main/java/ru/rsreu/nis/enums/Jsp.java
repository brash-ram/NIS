package ru.rsreu.nis.enums;

public enum Jsp {
    LOGIN("/jsp/login.jsp"),
    DRIVER_PROFILE("/jsp/driverProfile.jsp"),
    PASSENGER_PROFILE("/jsp/passengerProfile.jsp"),
    CREATE_TRIP("/jsp/createTrip.jsp"),
    APPROVE_PASSENGER("/jsp/approvePassenger.jsp"),
    RATE_PASSENGER("/jsp/ratePassenger.jsp"),
    TRIP_PARAMETERS("/jsp/tripParameters.jsp"),
    TRIP_REQUESTS("/jsp/tripRequests.jsp"),
    TRIPS_INFO("/jsp/tripsInfo.jsp"),
    PASSENGER_MARKS("/jsp/passengersMarks.jsp"),
    LOGOUT("/jsp/login.jsp"),
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
