package ru.rsreu.nis.service;

import ru.rsreu.nis.database.DatabaseType;
import ru.rsreu.nis.database.dao.DAOFactory;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.entity.User;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        DAOFactory daoFactory = DAOFactory.getInstance(DatabaseType.ORACLE);
//        userDAO = daoFactory
    }

    public User authtorization(String login, String password) {

    }
}
