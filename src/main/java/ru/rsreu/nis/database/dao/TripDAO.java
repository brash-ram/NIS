package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Trip;

import java.util.List;

public interface TripDAO {
    List<Trip> findAll();
    Trip getTripById(Long id);
    Trip getTripById(String id);
    void updateDevice(Trip trip);
    void deleteDevice(Trip trip);
    void createDevice(Trip trip);
}
