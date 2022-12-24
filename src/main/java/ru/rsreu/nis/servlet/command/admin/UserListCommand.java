package ru.rsreu.nis.servlet.command.admin;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.SessionStatus;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.SessionService;
import ru.rsreu.nis.service.UserService;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.utils.SessionUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class UserListCommand extends FrontCommand {

    private UserService userService;
    private SessionService sessionService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        sessionService = ServiceFactory.getSessionService();
    }

    @Override
    public void process() throws ServletException, IOException {
        List<Session> sessions = null;
        String status = request.getParameter(RequestParam.STATUS);
        if (status != null) {
            if (status.equals("BLOCKED")) {
                sessions = sessionService.getAllSessionsByUserStatus(status);
            } else if (status.equals("AUTHORIZED")) {
                sessions = sessionService.getAllSessions();
            }
        } else {
            sessions = sessionService.getAllSessions();
        }
        sessions = sessions.stream().peek(session -> {
            if (session.getActiveUntil() != null && SessionUtil.checkValid(session)) {
                session.setStatus(SessionStatus.AUTHORIZED);
            } else {
                session.setStatus(SessionStatus.NOT_AUTHORIZED);
            }
        }).collect(Collectors.toList());

        request.setAttribute(RequestAttribute.SESSIONS, sessions);
        forward(Jsp.USER_LIST);
    }
}
