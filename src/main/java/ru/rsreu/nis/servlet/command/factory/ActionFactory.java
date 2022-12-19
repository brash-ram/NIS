package ru.rsreu.nis.servlet.command.factory;

import ru.rsreu.nis.resourcer.ProjectResourcer;
import ru.rsreu.nis.servlet.command.ActionCommand;
import ru.rsreu.nis.servlet.command.EmptyCommand;
import ru.rsreu.nis.servlet.command.client.CommandEnum;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
    public ActionFactory() {
    }

    public ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand current = new EmptyCommand();
        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            return current;
        }
        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
            current = currentEnum.getCurrentCommand();
        } catch(IllegalArgumentException e) {
            request.setAttribute("wrongAction", action + ProjectResourcer.getInstance().getString("message.wrongaction"));
        }

        return current;
    }

}
