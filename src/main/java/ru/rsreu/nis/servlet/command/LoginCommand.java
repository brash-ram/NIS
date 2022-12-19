package ru.rsreu.nis.servlet.command;


import ru.rsreu.nis.logic.LoginLogic;
import ru.rsreu.nis.resourcer.ProjectResourcer;
import ru.rsreu.nis.servlet.resource.ConfigurationManager;
import ru.rsreu.nis.servlet.resource.MessageManager;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements ActionCommand {

    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String password = request.getParameter(PARAM_NAME_PASSWORD);
        page = ProjectResourcer.getInstance().getString("path.page.index");

        if (LoginLogic.checkLogin(login, password)) {
            request.setAttribute("login", login);
            if ("driver".equals(login)) {
                page = ConfigurationManager.getProperty("path.page.driverProfile");
            } else if ("passenger".equals(login)) {
                page = ConfigurationManager.getProperty("path.page.passengerProfile");
            }
        } else {
            request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("path.page.login");
        }
        return page;
    }

}
