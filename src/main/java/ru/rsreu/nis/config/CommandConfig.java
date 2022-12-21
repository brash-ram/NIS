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
            Map.entry(Route.NOT_FOUND, new EmptyCommand()),
            Map.entry(Route.DRIVER_PROFILE, new DriverProfileCommand()),
            Map.entry(Route.PASSENGER_PROFILE, new PassengerProfileCommand()),
            Map.entry(Route.CREATE_TRIP, new CreateTripCommand())
    );

    private static final List<Route> commandRoutes = Arrays.asList(
            Route.LOGIN,
            Route.MY_REQUESTS,
            Route.DRIVER_PROFILE,
            Route.PASSENGER_PROFILE,
            Route.USERS,
            Route.NOT_FOUND,
            Route.CREATE_TRIP
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
