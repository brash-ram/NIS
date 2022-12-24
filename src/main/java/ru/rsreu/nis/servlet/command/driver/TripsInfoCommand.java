package ru.rsreu.nis.servlet.command.driver;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.TripService;
import ru.rsreu.nis.service.UserService;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.utils.UserUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class TripsInfoCommand extends FrontCommand {
    private TripService tripService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        tripService = ServiceFactory.getTripService();
    }

    @Override
    public void process() throws ServletException, IOException {
        Optional<Integer> userId = UserUtil.getUserIdFromCookies(request.getCookies());
        List<Trip> trips = tripService.findAllByDriver(userId.get());
        request.setAttribute(RequestAttribute.TRIPS, trips);
        forward(Jsp.TRIPS_INFO);
    }

    @Override
    public void send() throws ServletException, IOException {
        super.send();
    }
}
