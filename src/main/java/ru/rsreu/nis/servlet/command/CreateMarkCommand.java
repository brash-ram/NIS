package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.service.MarkService;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateMarkCommand extends FrontCommand {
    private MarkService markService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        markService = ServiceFactory.getMarkService();
    }

    @Override
    public void send() throws ServletException, IOException {
        String mark = request.getParameter(RequestParam.MARk);
        String tripId = request.getParameter(RequestParam.TRIP_ID);
        String toUserId = request.getParameter(RequestParam.USER_ID);
        markService.createMark(mark, Integer.valueOf(tripId), user, Integer.valueOf(toUserId));
    }
}
