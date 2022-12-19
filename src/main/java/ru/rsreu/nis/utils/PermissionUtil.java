package ru.rsreu.nis.utils;

import ru.rsreu.nis.config.AuthConfig;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.enums.Route;

import java.util.List;

public class PermissionUtil {
    public static boolean hasPermission(String path, User user) {
        List<Route> routes = AuthConfig.getRoutes(user.getUserRole());

        for (Route route : routes) {
            if (path.contains(route.getRelative())) {
                return true;
            }
        }

        return false;
    }
}