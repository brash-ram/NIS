package ru.rsreu.nis.config;

import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.servlet.command.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CommandConfig {
    private static final Map<Route, FrontCommand> commands = Map.ofEntries(
            Map.entry(Route.LOGIN, new LoginCommand()),
            Map.entry(Route.LOGOUT, new LogoutCommand()),
            Map.entry(Route.NOT_FOUND, new EmptyCommand()),
            Map.entry(Route.DRIVER_PROFILE, new DriverProfileCommand()),
            Map.entry(Route.PASSENGER_PROFILE, new PassengerProfileCommand()),
            Map.entry(Route.CREATE_TRIP, new CreateTripCommand()),
            Map.entry(Route.APPROVE_PASSENGER, new ApprovePassengerCommand()),
            Map.entry(Route.RATE_PASSENGER, new RatePassengerCommand()),
            Map.entry(Route.TRIP_PARAMETERS, new TripParametersCommand()),
            Map.entry(Route.TRIP_REQUESTS, new TripRequestsCommand()),
            Map.entry(Route.TRIPS_INFO, new TripsInfoCommand()),
            Map.entry(Route.PASSENGERS_MARKS, new PassengersMarksCommand())
    );

    private static final List<Route> commandRoutes = Arrays.asList(
            Route.LOGIN,
            Route.LOGOUT,
            Route.MY_REQUESTS,
            Route.DRIVER_PROFILE,
            Route.PASSENGER_PROFILE,
            Route.USERS,
            Route.NOT_FOUND,
            Route.CREATE_TRIP,
            Route.APPROVE_PASSENGER,
            Route.RATE_PASSENGER,
            Route.TRIP_PARAMETERS,
            Route.TRIP_REQUESTS,
            Route.TRIPS_INFO,
            Route.PASSENGERS_MARKS
    );

    public static FrontCommand getCommand(String path) {
        for (Route route : commandRoutes) {
            if (route.getRelative().equalsIgnoreCase(path)) {
                return commands.get(route);
            }
        }
        return new EmptyCommand();
    }
}
