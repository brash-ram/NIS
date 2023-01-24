package ru.rsreu.nis.servlet.command.admin;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.dto.UserInfoDTO;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.service.MarkService;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.UserService;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteUserCommand extends FrontCommand {

    private UserService userService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        userService = ServiceFactory.getUserService();
    }

    @Override
    public void send() throws ServletException, IOException {
        Integer userId = Integer.valueOf(request.getParameter(RequestParam.USER_ID));
        userService.deleteUser(userId);
        redirect(Route.ADMIN_PROFILE.getAbsolute());
    }

}
