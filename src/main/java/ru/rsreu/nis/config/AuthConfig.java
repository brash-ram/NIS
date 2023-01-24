package ru.rsreu.nis.config;

import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.enums.Route;

import java.util.List;
import java.util.Map;

import static ru.rsreu.nis.enums.Route.*;

public class AuthConfig {
    private static final Map<Roles, List<Route>> RolesRoutes = Map.ofEntries(
            Map.entry(Roles.DRIVER, List.of(
                    LOGOUT,
                    LOGIN,
                    USERS,
                    USER_INFO,
                    DRIVER_PROFILE,
                    CREATE_TRIP,
                    COMPLETE_TRIP,
                    CREATE_MARK,
                    MARKS,
                    APPROVE_PASSENGER,
                    DISAPPROVE_PASSENGER,
                    PASSENGER_LIST,
                    TRIP_PARAMETERS,
                    TRIPS_INFO
            )),
            Map.entry(Roles.PASSENGER, List.of(
                    LOGOUT,
                    LOGIN,
                    PASSENGER_PROFILE,
                    CREATE_REQUEST,
                    MARKS,
                    CREATE_MARK,
                    USER_INFO,
                    RATE_DRIVER,
                    MY_REQUESTS,
                    ACTIVE_REQUESTS,
                    REQUESTS_HISTORY
            )),
            Map.entry(Roles.ADMIN, List.of(
                    LOGOUT,
                    LOGIN,
                    ADMIN_PROFILE,
                    CHANGE_USER,
                    DELETE_USER,
                    USER_INFO,
                    ADD_USER,
                    USER_LIST
            )),
            Map.entry(Roles.MODERATOR, List.of(
                    LOGIN,
                    MODER_PROFILE,
                    TRIP_LIST,
                    REQUEST_LIST,
                    USER_INFO,
                    LOGOUT,
                    BLOCK_USER,
                    UNBLOCK_USER,
                    USER_LIST
            ))
    );

    private static final Map<Roles, Route> RolesStartPage = Map.ofEntries(
            Map.entry(Roles.DRIVER, Route.DRIVER_PROFILE),
            Map.entry(Roles.PASSENGER, Route.PASSENGER_PROFILE),
            Map.entry(Roles.MODERATOR, Route.MODER_PROFILE),
            Map.entry(Roles.ADMIN, Route.ADMIN_PROFILE)
    );

    public static List<Route> getRoutes(Roles Roles) {
        return RolesRoutes.get(Roles);
    }

    public static Route getStartPage(Roles Roles) {
        return RolesStartPage.get(Roles);
    }
}
