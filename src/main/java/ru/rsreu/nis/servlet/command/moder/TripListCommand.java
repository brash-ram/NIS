package ru.rsreu.nis.servlet.command.moder;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.TripService;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class TripListCommand extends FrontCommand {
    private TripService tripService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        tripService = ServiceFactory.getTripService();
    }

    @Override
    public void process() throws ServletException, IOException {
        List<Trip> trips = tripService.findAll();
        request.setAttribute(RequestAttribute.TRIPS, trips);
        forward(Jsp.TRIP_LIST);
    }
}
