package ru.rsreu.nis.enums;

public enum Jsp {
    LOGIN("/jsp/login.jsp"),
    DRIVER_PROFILE("/jsp/driver/driverProfile.jsp"),
    CREATE_TRIP("/jsp/driver/createTrip.jsp"),
    APPROVE_PASSENGER("/jsp/driver/approvePassenger.jsp"),
    RATE_PASSENGER("/jsp/driver/ratePassenger.jsp"),
    TRIP_PARAMETERS("/jsp/tripParameters.jsp"),
    CERTAIN_TRIP_REQUESTS("/jsp/driver/certainTripRequests.jsp"),
    TRIPS_INFO("/jsp/driver/tripsInfo.jsp"),
    PASSENGER_MARKS("/jsp/driver/passengersMarks.jsp"),

    PASSENGER_PROFILE("/jsp/passenger/passengerProfile.jsp"),
    CREATE_REQUEST("/jsp/passenger/createRequest.jsp"),
    DRIVER_MARKS("/jsp/passenger/driverMarks.jsp"),
    RATE_DRIVER("/jsp/passenger/rateDriver.jsp"),
    TRIP_REQUESTS("/jsp/passenger/tripRequests.jsp"),

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
