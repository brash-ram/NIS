package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.entity.enums.TripStatus;

import java.util.List;

/**
 * The Data Access Object that providing access
 * to Request Entity.
 *
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 *
 */
public interface RequestDAO {

    /**
     * Saves Request Entity to DB
     *
     * @param request required Request Entity to save
     */
    void save(Request request);

    /**
     * Deletes Request Entity from DB
     *
     * @param requestId required Request Entity to delete
     */
    void delete(Integer requestId);

    /**
     * Updates Request Entity information in DB
     *
     * @param request required Request Entity to update
     */
    void update(Request request);

    /**
     * Finds Trip in the system by id
     *
     * @param requestId ID of required Request Entity
     * @return object of found Request
     */
    Request findById(Integer requestId);

    /**
     * Finds for all current Request in the system
     *
     * @return list of found Request objects
     */
    List<Request> findAll();

    /**
     * Finds for all current Request in the system by passengerId and trip status
     *
     * @param passengerId ID of required User Entity
     * @param tripStatus status of required Trip Entity
     * @return list of found Request objects
     */
    List<Request> findAllByPassengerAndTripStatus(Integer passengerId, TripStatus tripStatus);

    /**
     * Finds for all current Request in the system by tripId
     *
     * @param tripId ID of required Trip Entity
     * @return list of found Request objects
     */
    List<Request> findAllByTrip(Integer tripId);

    /**
     * Finds for all current Request in the system by driverId
     *
     * @param driverId ID of required User Entity
     * @return list of found Request objects
     */
    List<Request> findAllByDriver(Integer driverId);
}
