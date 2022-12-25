package ru.rsreu.nis.servlet.command.moder;

import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import java.io.IOException;

public class RequestListCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.REQUEST_LIST);
    }
}
