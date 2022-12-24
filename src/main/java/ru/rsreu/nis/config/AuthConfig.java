package ru.rsreu.nis.config;

import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.enums.Route;

import java.util.List;
import java.util.Map;

public class AuthConfig {
    private static final Map<Roles, List<Route>> RolesRoutes = Map.ofEntries(
            Map.entry(Roles.DRIVER, List.of(
                    Route.LOGIN
            )),
            Map.entry(Roles.PASSENGER, List.of(
                    Route.LOGIN
            )),
            Map.entry(Roles.ADMIN, List.of(

            )),
            Map.entry(Roles.MODERATOR, List.of(

            ))
    );

    private static final Map<Roles, Route> RolesStartPage = Map.ofEntries(
            Map.entry(Roles.DRIVER, Route.DRIVER_PROFILE),
            Map.entry(Roles.PASSENGER, Route.PASSENGER_PROFILE),
            Map.entry(Roles.MODERATOR, Route.USERS),
            Map.entry(Roles.ADMIN, Route.USERS)
    );

    public static List<Route> getRoutes(Roles Roles) {
        return RolesRoutes.get(Roles);
    }

    public static Route getStartPage(Roles Roles) {
        return RolesStartPage.get(Roles);
    }
}
