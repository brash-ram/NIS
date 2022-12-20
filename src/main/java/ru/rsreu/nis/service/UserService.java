package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.entity.User;

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

    public User getUser(String login) {
        return userDAO.findUserByLogin(login);
    }

    public User getUser(Integer id) {
        return userDAO.findUserById(4);
    }
}
