package ru.rsreu.nis.service;

import ru.rsreu.nis.database.DatabaseType;
import ru.rsreu.nis.database.dao.DAOFactory;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.enums.UserStatus;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        DAOFactory daoFactory = DAOFactory.getInstance(DatabaseType.ORACLE);
//        userDAO = daoFactory
    }

    public User authorization(String login, String password) {
        return new User(1L, "login", "pass",
                UserStatus.NOT_BLOCKED, "Александр", "Пруцков");
    }
}
