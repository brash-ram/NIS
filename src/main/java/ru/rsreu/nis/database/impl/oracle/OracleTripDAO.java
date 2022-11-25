package ru.rsreu.nis.database.impl.oracle;

import ru.rsreu.nis.database.dao.TripDAO;
import ru.rsreu.nis.entity.Trip;

import java.util.List;

public class OracleTripDAO implements TripDAO {
    @Override
    public List<Trip> findAll() {
        return null;
    }

    @Override
    public Trip getTripById(Long id) {
        return null;
    }

    @Override
    public Trip getTripById(String id) {
        return null;
    }

    @Override
    public void updateDevice(Trip trip) {

    }

    @Override
    public void deleteDevice(Trip trip) {

    }

    @Override
    public void createDevice(Trip trip) {

    }
}
