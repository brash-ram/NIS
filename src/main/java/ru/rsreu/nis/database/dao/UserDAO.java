package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    List<User> findAll();
    User findUserById(Integer id);
    User findUserByLogin(String login);
    Optional<User> updateUser(User user);
    void deleteUser(User user);
    Optional<User> save(User user);
}
