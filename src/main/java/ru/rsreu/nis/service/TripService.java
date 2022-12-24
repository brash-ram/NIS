package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.TripDAO;
import ru.rsreu.nis.entity.Trip;

import java.util.List;

@RequiredArgsConstructor
public class TripService {
    private static TripService instance;
    private final TripDAO tripDAO;

    public static TripService getInstance() {
        synchronized (TripService.class) {
            if (instance == null) {
                instance = new TripService(DAOFactory.getTripDAO());
            }
        }
        return instance;
    }

    public void saveTrip(Trip trip) {
        tripDAO.save(trip);
    }

    public List<Trip> findAll() {return tripDAO.findAll();}
}
