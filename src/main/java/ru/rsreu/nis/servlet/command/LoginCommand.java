package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.logic.LoginLogic;
import ru.rsreu.nis.resourcer.ConfigurationManager;
import ru.rsreu.nis.resourcer.MessageManager;
import ru.rsreu.nis.resourcer.ProjectResourcer;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements ActionCommand {

    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String password = request.getParameter(PARAM_NAME_PASSWORD);
        page = ProjectResourcer.getInstance().getString("path.page.login");

        if (LoginLogic.checkLogin(login, password)) {
            request.setAttribute("login", login);
            if ("driver".equals(login)) {
                page = ProjectResourcer.getInstance().getString("path.page.driverProfile");
            } else if ("passenger".equals(login)) {
                page = ProjectResourcer.getInstance().getString("path.page.passengerProfile");
            }
        } else {
            request.setAttribute("errorLoginPassMessage", ProjectResourcer.getInstance().getString("message.loginError"));
            page = ProjectResourcer.getInstance().getString("path.page.login");
        }
        return page;
    }

}
