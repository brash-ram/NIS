package ru.rsreu.nis.servlet.command.admin;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.entity.enums.UserStatus;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.UserService;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUserCommand extends FrontCommand {
    private UserService userService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        userService = ServiceFactory.getUserService();
    }

    @Override
    public void process() throws ServletException, IOException {
        String userIdString = request.getParameter(RequestParam.USER_ID);
        if (userIdString != null) {
            Integer userId = Integer.valueOf(userIdString);
            User user = userService.getUser(userId);
            request.setAttribute(RequestAttribute.USER, user);
        }
        forward(Jsp.ADD_USER);
    }

    @Override
    public void send() throws ServletException, IOException {
        User user = null;
        try {
            user = this.mapUser();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        userService.save(user);
        response.sendRedirect(Route.ADMIN_PROFILE.getAbsolute());
    }

    private User mapUser() {
        return new User(
                request.getParameter("id") != null ? Integer.valueOf(request.getParameter("id")) : null,
                request.getParameter(RequestParam.LOGIN),
                request.getParameter(RequestParam.PASSWORD),
                UserStatus.NOT_BLOCKED,
                request.getParameter(RequestParam.FIRST_NAME),
                request.getParameter(RequestParam.LAST_NAME),
                Roles.valueOf(request.getParameter(RequestParam.ROLE))
        );
    }
}
