package ru.rsreu.nis.servlet.command.driver;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.constant.RequestParam;
import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.entity.User;
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
import java.util.Optional;

public class ApprovePassengerCommand extends FrontCommand {

    private RequestService requestService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        requestService = ServiceFactory.getRequestService();
    }

    @Override
    public void process() throws ServletException, IOException {
        List<Request> requests = requestService.getAllRequestsByDriver(user.getUserId());
        request.setAttribute(RequestAttribute.REQUESTS, requests);
        forward(Jsp.APPROVE_PASSENGER);
    }

    @Override
    public void send() throws ServletException, IOException {
        String requestId = request.getParameter(RequestParam.REQUEST_ID);
        requestService.updateRequest(requestService.getRequest(Integer.valueOf(requestId))
                .setRequestStatus(RequestStatus.APPROVED));
    }
}
