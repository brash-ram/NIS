package ru.rsreu.nis.database.impl;

import ru.rsreu.nis.database.AbstractDAO;
import ru.rsreu.nis.database.dao.RequestDAO;
import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.entity.enums.TripStatus;
import ru.rsreu.nis.mapper.DAOMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RequestDAOImpl extends AbstractDAO implements RequestDAO {
    private static RequestDAOImpl instance;

    public static RequestDAOImpl getInstance() {
        synchronized (RequestDAOImpl.class) {
            if (instance == null) {
                instance = new RequestDAOImpl();
            }
        }
        return instance;
    }

    @Override
    public Request findById(Integer requestId) {
        String query = resourcer.getString("request.find.id");

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, requestId);

            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                return DAOMapper.mapRequest(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Request request) {
        String query = resourcer.getString("request.update");

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, request.getRequestStatus().toString());
            statement.setInt(2, request.getRequestId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer requestId) {
        String query = resourcer.getString("request.delete");

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, requestId);

            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Request> findAllByDriver(Integer driverId) {
        String query = resourcer.getString("request.find.all.driver");
        List<Request> requests = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, driverId);

            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                requests.add(DAOMapper.mapRequest(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return requests;
    }

    @Override
    public void save(Request request) {
        String query = resourcer.getString("request.save");

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, request.getPassenger().getUserId());
            statement.setInt(2, request.getTrip().getTripId());
            statement.setString(3, request.getRequestStatus().toString());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Request> findAll() {
        String query = resourcer.getString("request.find.all");
        List<Request> requests = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                requests.add(DAOMapper.mapRequest(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return requests;
    }

    @Override
    public List<Request> findAllByPassengerAndTripStatus(Integer passengerId, TripStatus tripStatus) {
        String query = resourcer.getString("request.find.all.passenger");
        List<Request> requests = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, passengerId);
            st.setString(2, tripStatus.toString());

            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                requests.add(DAOMapper.mapRequest(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return requests;
    }

    @Override
    public List<Request> findAllByTrip(Integer tripId) {
        String query = resourcer.getString("request.find.all.trip");
        List<Request> requests = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, tripId);

            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                requests.add(DAOMapper.mapRequest(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return requests;
    }
}
