package ru.rsreu.nis.servlet.command;

import com.sun.org.apache.bcel.internal.generic.NEW;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.resourcer.ProjectResourcer;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class HomeCommand extends FrontCommand {
    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
    }

    @Override
    public void process() throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("resources", ProjectResourcer.getInstance());
        forward("home");
    }

    @Override
    public void send() throws ServletException, IOException {
        super.send();
    }
}
