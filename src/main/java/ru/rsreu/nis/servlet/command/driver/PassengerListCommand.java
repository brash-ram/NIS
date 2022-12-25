package ru.rsreu.nis.servlet.command.driver;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.dto.MarkDTO;
import ru.rsreu.nis.entity.Mark;
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

public class PassengerListCommand extends FrontCommand {
    private MarkService markService;
    private RequestService requestService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        markService = ServiceFactory.getMarkService();
        requestService = ServiceFactory.getRequestService();
    }

    @Override
    public void process() throws ServletException, IOException {
        Integer tripId = Integer.valueOf(request.getParameter(RequestParam.TRIP_ID));
        List<Request> requests = requestService.getAllRequestByTrip(tripId);
        request.setAttribute(RequestParam.TRIP_ID, tripId);
        request.setAttribute(RequestParam.USER_ID, user.getUserId());
        request.setAttribute(RequestAttribute.REQUESTS, requests);
        request.setAttribute(RequestAttribute.ALL_MARKS, markService.getAllMarks());
        request.setAttribute(RequestAttribute.MARKS, markService.getMarksByFromUserAndTrip(requests, user.getUserId()));
        forward(Jsp.PASSENGER_LIST);
    }
}
