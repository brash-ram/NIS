package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeCommand extends FrontCommand {
    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
    }

    @Override
    public void process() throws ServletException, IOException {
        forward("home");
    }

    @Override
    public void send() throws ServletException, IOException {
        super.send();
    }
}
