package ru.rsreu.nis.wrapper;

import ru.rsreu.nis.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.security.Principal;

public class UserRoleRequestWrapper extends HttpServletRequestWrapper {
    private final User user;

    public UserRoleRequestWrapper(HttpServletRequest request, User user) {
        super(request);

        this.user = user;
    }

    @Override
    public boolean isUserInRole(String roleAsString) {
        return user.getUserRole().toString().equalsIgnoreCase(roleAsString);
    }

    @Override
    public Principal getUserPrincipal() {
        return this.user;
    }
}
