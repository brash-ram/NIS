package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Trip;

import java.util.List;

/**
 * The Data Access Object that providing access
 * to Trip Entity.
 *
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 *
 */
public interface TripDAO {

    /**
     * Finds for all current Trips in the system
     *
     * @return list of found Trip objects
     */
    List<Trip> findAll();

    /**
     * Finds for all current Trips in the system by driverId
     *
     * @param driverId ID of required User Entity
     * @return list of found Trip objects
     */
    List<Trip> findAllByDriver(Integer driverId);

    /**
     * Finds for all current Trips in the system without passenger with passengerId
     *
     * @param passengerId ID of required User Entity
     * @return list of found Trip objects
     */
    List<Trip> findAllByNoPassenger(Integer passengerId);

    /**
     * Finds Trip in the system by id
     *
     * @param id ID of required Trip Entity
     * @return object of found Trip
     */
    Trip findTripById(Integer id);

    /**
     * Updates Trip Entity information in DB
     *
     * @param trip required Trip Entity to update
     */
    void update(Trip trip);

    /**
     * Deletes Trip Entity from DB
     *
     * @param tripId required Trip Entity to delete
     */
    void delete(Integer tripId);

    /**
     * Saves Trip Entity to DB
     *
     * @param trip required Trip Entity to save
     */
    void save(Trip trip);
}
