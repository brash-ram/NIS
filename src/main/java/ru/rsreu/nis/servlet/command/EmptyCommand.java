package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.resourcer.ProjectResourcer;

import javax.servlet.http.HttpServletRequest;

public class EmptyCommand implements ActionCommand{
    @Override
    public String execute(HttpServletRequest request) {
        String page = ProjectResourcer.getInstance().getString("path.page.login");
        return page;
    }
}
