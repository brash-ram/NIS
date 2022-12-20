package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.database.impl.SessionDAOImpl;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.UserStatus;

@RequiredArgsConstructor
public class UserService {
    private static UserService instance;
    private final UserDAO userDAO;

    public static UserService getInstance() {
        synchronized (UserService.class) {
            if (instance == null) {
                instance = new UserService(DAOFactory.getUserDAO());
            }
        }
        return instance;
    }

    public User findByLogin(String login) {
        return userDAO.getUserByLogin(login);
    }

    public User getUser() {
        return userDAO.getUserById(4L);
    }
}
