package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.entity.enums.TripStatus;

import java.util.List;

public interface RequestDAO {
    void save(Request request);
    void delete(Integer requestId);
    void update(Request request);
    Request findById(Integer requestId);
    List<Request> findAll();
    List<Request> findAllByPassengerAndTripStatus(Integer passengerId, TripStatus tripStatus);
    List<Request> findAllByTrip(Integer tripId);
    List<Request> findAllByDriver(Integer driverId);
}
