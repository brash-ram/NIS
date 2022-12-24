package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.database.AbstractDAO;
import ru.rsreu.nis.entity.Trip;

import java.util.List;

public interface TripDAO {
    List<Trip> findAll();
    Trip findTripById(Integer id);
    Trip findTripById(String id);
    void update(Trip trip);
    void delete(Trip trip);
    void save(Trip trip);
}
