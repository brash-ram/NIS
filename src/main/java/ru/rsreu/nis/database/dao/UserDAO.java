package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * The Data Access Object that providing access
 * to User Entity.
 *
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 *
 */
public interface UserDAO {

    /**
     * Finds for all User Entities
     *
     * @return list of found User objects
     */
    List<User> findAll();

    /**
     * Finds for a User Entity by ID
     *
     * @param id ID of required User Entity
     * @return object of found User in the Optional wrapper
     */
    User findUserById(Integer id);

    /**
     * Finds for a User Entity by Login
     *
     * @param login Username of required User Entity
     * @return object of found User in the Optional wrapper
     */
    User findUserByLogin(String login);

    /**
     * Updates User Entity information in DB
     *
     * @param user required User Entity to update
     */
    Optional<User> update(User user);

    /**
     * Deletes User Entity from DB
     *
     * @param user required User Entity to delete
     */
    void delete(User user);

    /**
     * Saves User Entity to DB
     *
     * @param user required User Entity to save
     */
    void save(User user);
}
