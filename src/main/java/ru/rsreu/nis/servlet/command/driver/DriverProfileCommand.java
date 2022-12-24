package ru.rsreu.nis.servlet.command.driver;

import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import java.io.IOException;

public class DriverProfileCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.DRIVER_PROFILE);
    }

    @Override
    public void send() throws ServletException, IOException {
        super.send();
    }
}
