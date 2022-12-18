package ru.rsreu.nis.servlet.command.client;

import ru.rsreu.nis.servlet.command.ActionCommand;
import ru.rsreu.nis.servlet.command.LoginCommand;

public enum CommandEnum {

    LOGIN {
        {
            this.command = new LoginCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
