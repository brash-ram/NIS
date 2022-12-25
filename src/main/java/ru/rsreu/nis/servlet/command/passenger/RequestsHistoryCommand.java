package ru.rsreu.nis.servlet.command.passenger;

import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import java.io.IOException;

public class RequestsHistoryCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.REQUESTS_HISTORY);
    }

    @Override
    public void send() throws ServletException, IOException {
        super.send();
    }
}
