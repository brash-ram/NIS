package ru.rsreu.nis.servlet;

import ru.rsreu.nis.config.CommandConfig;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FrontCommand command = CommandConfig.getCommand(request.getPathInfo());

        try {
            command.init(getServletContext(), request, response);
            command.process();
        } catch (Exception exception) {
            exception.printStackTrace();
//            ExceptionHandler exceptionHandler = new ExceptionHandler();
//
//            exceptionHandler.init(getServletContext(), req, res);
//            exceptionHandler.handleException(exception);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FrontCommand command = CommandConfig.getCommand(request.getPathInfo());

        try {
            command.init(getServletContext(), request, response);
            command.send();
        } catch (Exception exception) {
            exception.printStackTrace();
//            ExceptionHandler exceptionHandler = new ExceptionHandler();
//
//            exceptionHandler.init(getServletContext(), req, res);
//            exceptionHandler.handleException(exception);
        }
    }

//    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String page = null;
//        ActionFactory client = new ActionFactory();
//        ActionCommand command = client.defineCommand(request);
//        page = command.execute(request);
//
//        if (page != null) {
//            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
//            dispatcher.forward(request, response);
//        }
//    }
}