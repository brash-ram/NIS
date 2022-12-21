package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.config.AuthConfig;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.SessionService;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.utils.UserUtil;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginCommand extends FrontCommand {
    private SessionService sessionService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        sessionService = ServiceFactory.getSessionService();
    }

    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.LOGIN);
    }

    @Override
    public void send() throws ServletException, IOException {
        String username = request.getParameter(RequestParam.LOGIN);
        String password = request.getParameter(RequestParam.PASSWORD);
        try {
            User user = sessionService.createSession(username, password);
            Roles role = user.getUserRole();
            Route startRoute = AuthConfig.getStartPage(role);
            Cookie userCookie = UserUtil.createUserCookie(user);
            response.addCookie(userCookie);
            response.sendRedirect(startRoute.getAbsolute());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
