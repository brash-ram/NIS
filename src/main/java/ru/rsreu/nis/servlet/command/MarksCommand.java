package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.constant.RequestAttribute;
import ru.rsreu.nis.dto.MarkDTO;
import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.ArrayList;


public class MarksCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        request.setAttribute(RequestAttribute.ROLE, user.getUserRole());
        request.setAttribute("marks", new ArrayList<MarkDTO>());
        forward(Jsp.MARKS);
    }
}
