package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.resourcer.ProjectResourcer;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class EmptyCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.LOGIN);
    }

    @Override
    public void send() throws ServletException, IOException {

    }
}
