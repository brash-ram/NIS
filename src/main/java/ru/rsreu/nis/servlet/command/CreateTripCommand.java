package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.config.AuthConfig;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.TripStatus;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.TripService;
import ru.rsreu.nis.servlet.FrontCommand;
import ru.rsreu.nis.utils.DateUtil;
import ru.rsreu.nis.utils.UserUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class CreateTripCommand extends FrontCommand {

    private TripService tripService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        tripService = ServiceFactory.getTripService();
    }

    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.CREATE_TRIP);
    }

    @Override
    public void send() throws ServletException, IOException {
        try {
            Trip trip = mapTripFromRequest();
            User user = UserUtil.getFromRequest(request).get();
            trip.setDriverId(user.getUserId());
            tripService.saveTrip(trip);
            response.sendRedirect(AuthConfig.getStartPage(user.getUserRole()).getAbsolute());
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    private Trip mapTripFromRequest() {
        return new Trip(
                0,
                request.getParameter(RequestParam.START_POINT),
                request.getParameter(RequestParam.FINAL_POINT),
                DateUtil.parse(request.getParameter(RequestParam.DATE)),
                Integer.valueOf(request.getParameter(RequestParam.FREE_SEATS)),
                Integer.valueOf(request.getParameter(RequestParam.PRICE)),
                null,
                TripStatus.IN_WAITING
        );
    }


}
