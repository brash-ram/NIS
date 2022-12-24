package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogoutCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        redirect(Route.LOGIN.getAbsolute());
    }

}
