package ru.rsreu.nis.servlet.command.passenger;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.entity.enums.RequestStatus;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.RequestService;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.TripService;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.utils.UserUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CreateRequestCommand extends FrontCommand {
    private TripService tripService;
    private RequestService requestService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        tripService = ServiceFactory.getTripService();
        requestService = ServiceFactory.getRequestService();
    }

    @Override
    public void process() throws ServletException, IOException {
        List<Trip> trips = tripService.getAllTripsByNotPassenger(user.getUserId());
        request.setAttribute(RequestAttribute.TRIPS, trips);
        forward(Jsp.CREATE_REQUEST);
    }

    @Override
    public void send() throws ServletException, IOException {
        String tripId = request.getParameter(RequestParam.TRIP_ID);
        requestService.createRequest(
                new Request(user, new Trip().setTripId(Integer.parseInt(tripId)), RequestStatus.IN_WAITING));
    }
}
