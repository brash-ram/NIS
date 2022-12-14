package ru.rsreu.nis.servlet.command.passenger;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.MarkService;
import ru.rsreu.nis.service.RequestService;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class RequestsHistoryCommand extends FrontCommand {
    private RequestService requestService;
    private MarkService markService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        requestService = ServiceFactory.getRequestService();
        markService = ServiceFactory.getMarkService();
    }

    @Override
    public void process() throws ServletException, IOException {
        List<Request> requests = requestService.getAllRequestsByPassengerHistory(user.getUserId());
        request.setAttribute(RequestAttribute.ALL_MARKS, markService.getAllMarks());
        request.setAttribute(RequestAttribute.MARKS, markService.getMarksByFromUserAndTrip(requests, user.getUserId()));
        request.setAttribute(RequestAttribute.REQUESTS, requests);
        forward(Jsp.HISTORY_REQUESTS);
    }

}
