package ru.rsreu.nis.config;

import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.servlet.command.*;
import ru.rsreu.nis.servlet.command.admin.AddUserCommand;
import ru.rsreu.nis.servlet.command.admin.AdminProfileCommand;
import ru.rsreu.nis.servlet.command.admin.UserInfoCommand;
import ru.rsreu.nis.servlet.command.admin.UserListCommand;
import ru.rsreu.nis.servlet.command.driver.*;
import ru.rsreu.nis.servlet.command.passenger.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CommandConfig {
    private static final Map<Route, FrontCommand> commands = Map.ofEntries(
            Map.entry(Route.LOGIN, new LoginCommand()),
            Map.entry(Route.LOGOUT, new LogoutCommand()),
            Map.entry(Route.USER_INFO, new UserInfoCommand()),

            Map.entry(Route.DRIVER_PROFILE, new DriverProfileCommand()),
            Map.entry(Route.CREATE_TRIP, new CreateTripCommand()),
            Map.entry(Route.APPROVE_PASSENGER, new ApprovePassengerCommand()),
            Map.entry(Route.DISAPPROVE_PASSENGER, new DisapprovePassengerCommand()),
            Map.entry(Route.RATE_PASSENGER, new RatePassengerCommand()),
            Map.entry(Route.TRIP_PARAMETERS, new TripParametersCommand()),
            Map.entry(Route.CERTAIN_TRIP_REQUESTS, new CertainTripRequestsCommand()),
            Map.entry(Route.TRIPS_INFO, new TripsInfoCommand()),
            Map.entry(Route.PASSENGERS_MARKS, new PassengersMarksCommand()),

            Map.entry(Route.PASSENGER_PROFILE, new PassengerProfileCommand()),
            Map.entry(Route.CREATE_REQUEST, new CreateRequestCommand()),
            Map.entry(Route.DRIVER_MARKS, new DriverMarksCommand()),
            Map.entry(Route.RATE_DRIVER, new RateDriverCommand()),
            Map.entry(Route.ACTIVE_REQUESTS, new ActiveRequestsCommand()),

            Map.entry(Route.ADMIN_PROFILE, new AdminProfileCommand()),
            Map.entry(Route.ADD_USER, new AddUserCommand()),
            Map.entry(Route.USER_LIST, new UserListCommand()),

            Map.entry(Route.NOT_FOUND, new EmptyCommand())
    );

    private static final List<Route> commandRoutes = Arrays.asList(
            Route.LOGIN,
            Route.LOGOUT,
            Route.USER_INFO,
            Route.NOT_FOUND,
            Route.MY_REQUESTS,
            Route.DRIVER_PROFILE,
            Route.USERS,
            Route.CREATE_TRIP,
            Route.APPROVE_PASSENGER,
            Route.DISAPPROVE_PASSENGER,
            Route.RATE_PASSENGER,
            Route.TRIP_PARAMETERS,
            Route.CERTAIN_TRIP_REQUESTS,
            Route.TRIPS_INFO,
            Route.PASSENGERS_MARKS,
            Route.PASSENGER_PROFILE,
            Route.CREATE_REQUEST,
            Route.DRIVER_MARKS,
            Route.RATE_DRIVER,
            Route.ACTIVE_REQUESTS,
            Route.ADMIN_PROFILE,
            Route.ADD_USER,
            Route.USER_LIST
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
