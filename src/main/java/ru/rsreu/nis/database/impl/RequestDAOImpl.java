package ru.rsreu.nis.database.impl;

import ru.rsreu.nis.database.AbstractDAO;
import ru.rsreu.nis.database.dao.RequestDAO;
import ru.rsreu.nis.entity.Request;
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
    public void save(Request request) {
        String query = resourcer.getString("request.save");

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, request.getPassenger().getUserId());
            statement.setInt(2, request.getTrip().getTripId());
            statement.setString(2, request.getRequestStatus().toString());

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
    public List<Request> findAllByPassenger(Integer passengerId) {
        String query = resourcer.getString("request.find.all.passenger");
        List<Request> requests = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, passengerId);

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
