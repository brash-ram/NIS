package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.User;

import java.util.List;
import java.util.Optional;

public interface SessionDAO {
    void save(Session session);

    List<Session> findAll();

    void deleteSession(User user);

    Optional<Session> getSession(Long userId);
}
