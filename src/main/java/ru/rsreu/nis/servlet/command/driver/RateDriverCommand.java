package ru.rsreu.nis.servlet.command.driver;

import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import java.io.IOException;

public class RateDriverCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.RATE_DRIVER);
    }
}
