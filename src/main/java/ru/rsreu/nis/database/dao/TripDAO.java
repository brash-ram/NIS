package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Trip;

import java.util.List;

public interface TripDAO {
    List<Trip> findAll();
    List<Trip> findAllByDriver(Integer driverId);
    List<Trip> findAllByNoPassenger(Integer passengerId);
    Trip findTripById(Integer id);
    void update(Trip trip);
    void delete(Integer tripId);
    void save(Trip trip);
}
