package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.data.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();
    User getUserById(int id);
    User getUserById(String id);
    User getUserByLogin(String login);
    void updateUser(User user);
    void deleteUser(User user);
    void addUser(User user);
}
