package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.service.MarkService;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.SessionService;
import ru.rsreu.nis.service.UserService;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.utils.UserUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

public class LogoutCommand extends FrontCommand {
    private SessionService sessionService;
    private UserService userService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        sessionService = ServiceFactory.getSessionService();
        userService = ServiceFactory.getUserService();
    }

    @Override
    public void process() throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        Optional<Integer> userId = UserUtil.getUserIdFromCookies(request.getCookies());
        userId.ifPresent(integer -> sessionService.deleteSession(integer));
        redirect(Route.LOGIN.getAbsolute());
    }

}
