package ru.rsreu.nis.servlet.command;

import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import java.io.IOException;

public class TripRequestsCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.TRIP_REQUESTS);
    }

    @Override
    public void send() throws ServletException, IOException {
        super.send();
    }
}
