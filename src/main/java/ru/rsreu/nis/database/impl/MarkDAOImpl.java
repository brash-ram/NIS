package ru.rsreu.nis.database.impl;

import ru.rsreu.nis.database.AbstractDAO;
import ru.rsreu.nis.database.dao.MarkDAO;
import ru.rsreu.nis.entity.Mark;
import ru.rsreu.nis.mapper.DAOMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarkDAOImpl extends AbstractDAO implements MarkDAO {

    private static MarkDAOImpl instance;

    public static MarkDAOImpl getInstance() {
        synchronized (MarkDAOImpl.class) {
            if (instance == null) {
                instance = new MarkDAOImpl();
            }
        }
        return instance;
    }

    @Override
    public List<Mark> findAllMarkByTripAndToUser(Integer tripId, Integer toUser) {
        String query = resourcer.getString("mark.find.trip.toUser");
        List<Mark> marks = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, tripId);
            st.setInt(2, toUser);
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                marks.add(DAOMapper.mapMark(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return marks;
    }

    @Override
    public Mark findMarkByTripAndFromUser(Integer tripId, Integer fromUser) {
        String query = resourcer.getString("mark.find.trip.fromUser");

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, tripId);
            st.setInt(2, fromUser);
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                return DAOMapper.mapMark(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Mark> findAllByToUser(Integer toUserId) {
        String query = resourcer.getString("mark.find.all.toUser");
        List<Mark> marks = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, toUserId);
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                marks.add(DAOMapper.mapMark(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return marks;
    }

    @Override
    public List<Mark> findAll() {
        String query = resourcer.getString("mark.find.all");
        List<Mark> marks = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                marks.add(DAOMapper.mapMark(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return marks;
    }

    @Override
    public void update(Mark mark) {
        String query = resourcer.getString("mark.update");

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, mark.getMark());
            statement.setInt(2, mark.getMarkId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer markId) {
        String query = resourcer.getString("mark.delete");

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, markId);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Mark mark) {
        String query = resourcer.getString("mark.save");

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, mark.getFromUser().getUserId());
            statement.setInt(2, mark.getToUser());
            statement.setInt(3, mark.getTrip().getTripId());
            statement.setInt(4, mark.getMark());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
