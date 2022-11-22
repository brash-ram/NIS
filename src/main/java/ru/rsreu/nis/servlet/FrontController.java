package ru.rsreu.nis.servlet;

import ru.rsreu.nis.utils.StringUtils;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "FrontControllerServlet")
public class FrontController extends HttpServlet {

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FrontCommand command = getCommand(req);
        command.init(getServletContext(), req, resp);
        command.process();
    }

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FrontCommand command = getCommand(req);
        command.init(getServletContext(), req, resp);
        command.send();
    }

    /**
     * @param request
     * @return
     */
    private FrontCommand getCommand(HttpServletRequest request) {
        try {
            String str = String.format(
                    "ru.rsreu.nis.servlet.command.%sCommand",
                    StringUtils.capitalize(request.getPathInfo().substring(1)));
            Class<?> type = Class.forName(str);
            return type
                    .asSubclass(FrontCommand.class)
                    .newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}