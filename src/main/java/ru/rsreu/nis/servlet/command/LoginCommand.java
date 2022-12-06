package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.service.UserService;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginCommand extends FrontCommand {

    private UserService userService;
    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        userService = UserService.getInstance();
    }

    @Override
    public void process() throws ServletException, IOException {
        forward("login");
    }

    @Override
    public void send() throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = userService.authorization(login, password);
        if (user != null) {
            request.setAttribute("mainContent", "");
            request.setAttribute("firstName", user.getFirstName());
            request.setAttribute("lastName", user.getLastName());
            forward("mainContainer");
        }

    }
}
