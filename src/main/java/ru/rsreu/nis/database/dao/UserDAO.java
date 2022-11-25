package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();
    User getUserById(Long id);
    User getUserById(String id);
    User getUserByLogin(String login);
    void updateUser(User user);
    void deleteUser(User user);
    void addUser(User user);
    User getUserByLoginAndPassword(String login, String password);
}
