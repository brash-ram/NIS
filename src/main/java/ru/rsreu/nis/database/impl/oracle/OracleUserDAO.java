package ru.rsreu.nis.database.impl.oracle;

import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.entity.User;

import java.util.List;

public class OracleUserDAO implements UserDAO {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void addUser(User user) {

    }
}
