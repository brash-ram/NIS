package ru.rsreu.nis.config;

import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.servlet.command.EmptyCommand;
import ru.rsreu.nis.servlet.command.LoginCommand;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CommandConfig {
    private static final Map<Route, FrontCommand> commands = Map.ofEntries(
            Map.entry(Route.LOGIN, new LoginCommand()),
            Map.entry(Route.NOT_FOUND, new EmptyCommand())
    );

    private static final List<Route> commandRoutes = Arrays.asList(
            Route.LOGIN,
            Route.MY_REQUESTS,
            Route.MY_TRIPS,
            Route.USERS,
            Route.NOT_FOUND
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
