package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.User;

import java.util.List;
import java.util.Optional;

public interface SessionDAO {
    List<Session> findAllByUserStatus(String status);

    void save(Session session);

    List<Session> findAll();

    void delete(User user);

    Optional<Session> findByUserId(Integer userId);

    void update(Session session);
}
