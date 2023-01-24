package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * The Data Access Object that providing access
 * to Session Entity.
 *
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 *
 */

public interface SessionDAO {

    /**
     * Saves Session Entity to DB
     *
     * @param session required Session Entity to save
     */
    void save(Session session);

    /**
     * Finds for all current Session Entities in the system
     *
     * @return list of found Session objects
     */
    List<Session> findAll();

    /**
     * Deletes Session Entity from DB by userId
     *
     * @param user ID of required User Entity
     */
    void delete(User user);

    /**
     * Finds for a Session Entity by ID
     *
     * @param userId ID of required User Entity
     * @return object of found Session in the Optional wrapper
     */
    Optional<Session> findByUserId(Integer userId);

    /**
     * Updates Session Entity information in DB
     *
     * @param session required Session Entity to update
     */
    void update(Session session);
}
