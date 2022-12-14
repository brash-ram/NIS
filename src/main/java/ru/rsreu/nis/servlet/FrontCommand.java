package ru.rsreu.nis.servlet;

import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.utils.UserUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class FrontCommand {
    protected ServletContext context;
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected User user;

    public void init(
            ServletContext servletContext,
            HttpServletRequest servletRequest,
            HttpServletResponse servletResponse) {
        this.context = servletContext;
        this.request = servletRequest;
        this.response = servletResponse;
        try {
            this.user = UserUtil.tryGetFromRequest(request);
        } catch (Exception e) {
        }
    }

    public void process() throws ServletException, IOException {
    }

    public void send() throws ServletException, IOException {
    }

    protected void forward(Jsp page) throws ServletException, IOException {
        RequestDispatcher dispatcher = context.getRequestDispatcher(page.getRoute());
        dispatcher.forward(request, response);
    }

    protected void redirect(String url) throws IOException {
        response.sendRedirect(url);
    }
}
