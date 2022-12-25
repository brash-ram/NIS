package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.dto.MarkDTO;
import ru.rsreu.nis.entity.Mark;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.service.MarkService;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MarksCommand extends FrontCommand {
    private MarkService markService;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);
        markService = ServiceFactory.getMarkService();
    }

    @Override
    public void process() throws ServletException, IOException {
        List<Mark> marks = markService.getAllMarksToUser(user.getUserId());
        request.setAttribute(RequestAttribute.ROLE, user.getUserRole());
        request.setAttribute(RequestAttribute.MARKS, marks);
        forward(Jsp.MARKS);
    }
}
