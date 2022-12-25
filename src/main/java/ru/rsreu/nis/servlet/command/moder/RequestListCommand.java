package ru.rsreu.nis.servlet.command.moder;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.RequestService;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class RequestListCommand extends FrontCommand {
    private RequestService requestService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        requestService = ServiceFactory.getRequestService();
    }

    @Override
    public void process() throws ServletException, IOException {
        List<Request> requests = requestService.getAllRequests();
        request.setAttribute(RequestAttribute.REQUESTS, requests);
        forward(Jsp.REQUEST_LIST);
    }
}
