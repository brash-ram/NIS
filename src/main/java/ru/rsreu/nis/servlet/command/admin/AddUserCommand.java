package ru.rsreu.nis.servlet.command.admin;

import ru.rsreu.nis.enums.Jsp;
import ru.rsreu.nis.servlet.FrontCommand;

import javax.servlet.ServletException;
import java.io.IOException;

public class AddUserCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward(Jsp.ADD_USER);
    }
}
