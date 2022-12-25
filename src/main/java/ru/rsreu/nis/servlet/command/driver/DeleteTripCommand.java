package ru.rsreu.nis.servlet.command.driver;

import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.TripService;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteTripCommand extends FrontCommand {

    private TripService tripService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        tripService = ServiceFactory.getTripService();
    }

    @Override
    public void send() throws ServletException, IOException {
        Integer tripId = Integer.valueOf(request.getParameter(RequestParam.TRIP_ID));
        tripService.deleteTrip(tripId);
    }
}
