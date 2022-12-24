package ru.rsreu.nis.database.impl;

import ru.rsreu.nis.database.AbstractDAO;
import ru.rsreu.nis.database.dao.TripDAO;
import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.mapper.DAOMapper;
import ru.rsreu.nis.resourcer.ProjectResourcer;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public List<Trip> findAllByDriver(Integer driverId) {
        String query = resourcer.getString("trip.find.all.driver");
        List<Trip> trips = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, driverId);

            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                trips.add(DAOMapper.mapTrip(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trips;
    }

    @Override
    public List<Trip> findAll() {
        String query = resourcer.getString("trip.find.all");
        List<Trip> trips = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                trips.add(DAOMapper.mapTrip(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trips;
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
