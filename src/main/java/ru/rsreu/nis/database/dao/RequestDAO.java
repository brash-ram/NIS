package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Request;

import java.util.List;

public interface RequestDAO {
    void save(Request request);
    List<Request> findAll();
    List<Request> findAllByPassenger(Integer passengerId);
    List<Request> findAllByTrip(Integer tripId);
}
