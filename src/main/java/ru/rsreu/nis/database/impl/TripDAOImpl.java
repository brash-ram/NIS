package ru.rsreu.nis.database.impl;

import ru.rsreu.nis.database.AbstractDAO;
import ru.rsreu.nis.database.dao.TripDAO;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.resourcer.ProjectResourcer;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TripDAOImpl extends AbstractDAO implements TripDAO {
    private static TripDAOImpl instance;

    public static TripDAOImpl getInstance() {
        synchronized (TripDAOImpl.class) {
            if (instance == null) {
                instance = new TripDAOImpl();
            }
        }
        return instance;
    }

    @Override
    public List<Trip> findAll() {
        return null;
    }

    @Override
    public Trip findTripById(Integer id) {
        return null;
    }

    @Override
    public Trip findTripById(String id) {
        return null;
    }

    @Override
    public void update(Trip trip) {

    }

    @Override
    public void delete(Trip trip) {

    }

    @Override
    public void save(Trip trip) {
        String query = ProjectResourcer.getInstance().getString("trip.save");

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, trip.getStartPoint());
            statement.setString(2, trip.getFinalPoint());
            statement.setDate(3, trip.getTripDate());
            statement.setInt(4, trip.getFreeSeats());
            statement.setInt(5, trip.getPrice());
            statement.setInt(6, trip.getDriverId());
            statement.setString(7, trip.getTripStatus().toString());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
