package ru.rsreu.nis.service;

import ru.rsreu.nis.database.DatabaseType;
import ru.rsreu.nis.database.dao.DAOFactory;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.database.impl.oracle.OracleDAOFactory;
import ru.rsreu.nis.entity.User;

public class UserService {
    private static UserService instance;
    private UserDAO userDAO;

    public static UserService getInstance() {
        if (instance == null) {
            synchronized (UserService.class) {
                instance = new UserService();
            }
        }
        return instance;
    }
    public UserService() {
        userDAO = OracleDAOFactory.getInstance().getUserDAO();
    }

    public User authorization(String login, String password) {
        return userDAO.getUserByLoginAndPassword(login, password);
    }
}
