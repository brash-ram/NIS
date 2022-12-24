package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.UserService;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserListCommand extends FrontCommand {

    private UserService userService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        userService = ServiceFactory.getUserService();
    }

    @Override
    public void process() throws ServletException, IOException {
        List<User> users = userService.getAllUsers();
        request.setAttribute(RequestAttribute.USERS, users);
        forward(Jsp.USER_LIST);
    }
}
