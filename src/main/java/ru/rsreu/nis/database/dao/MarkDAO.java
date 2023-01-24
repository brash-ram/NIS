package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Mark;

import java.util.List;

/**
 * The Data Access Object that providing access
 * to Mark Entity.
 *
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 *
 */
public interface MarkDAO {

    /**
     * Finds for all current Mark in the system
     *
     * @return list of found Mark objects
     */
    List<Mark> findAll();

    /**
     * Finds for all current Mark in the system by toUserId
     *
     * @param toUserId ID of required User Entity
     * @return list of found Mark objects
     */
    List<Mark> findAllByToUser(Integer toUserId);

    /**
     * Finds Mark by fromUser and tripId
     *
     * @param tripId ID of required Trip Entity
     * @param fromUser ID of required User Entity
     * @return Mark object
     */
    Mark findMarkByTripAndFromUser(Integer tripId, Integer fromUser);

    /**
     * Finds for all current Mark in the system by tripId and toUser
     *
     * @param tripId ID of required Trip Entity
     * @param toUser ID of required User Entity
     * @return list of found Mark objects
     */
    List<Mark> findAllMarkByTripAndToUser(Integer tripId, Integer toUser);

    /**
     * Updates Mark Entity information in DB
     *
     * @param mark required Mark Entity to update
     */
    void update(Mark mark);

    /**
     * Deletes Mark Entity from DB
     *
     * @param markId required Mark Entity to delete
     */
    void delete(Integer markId);

    /**
     * Saves Mark Entity to DB
     *
     * @param mark required Mark Entity to save
     */
    void save(Mark mark);
}
