package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.TripDAO;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.entity.enums.TripStatus;

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

    public void updateTrip(Trip trip) {
        tripDAO.update(trip);
    }
    public Trip getTrip(Integer tripId) {return tripDAO.findTripById(tripId);}
    public void deleteTrip(Integer tripId) {tripDAO.delete(tripId);}

    public List<Trip> findAll() {return tripDAO.findAll();}
    public List<Trip> findAllByDriver(Integer driverId) {return tripDAO.findAllByDriver(driverId);}

    public List<Trip> getAllTripsByNotPassenger(Integer passengerId) {
        return tripDAO.findAllByNoPassenger(passengerId);
    }

    public void completeTrip(Integer tripId) {
        Trip trip = this.getTrip(tripId);
        this.updateTrip(trip.setTripStatus(TripStatus.COMPLETED));
    }
}
