package ru.rsreu.nis.database.impl;

import ru.rsreu.nis.database.AbstractDAO;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.mapper.DAOMapper;
import ru.rsreu.nis.resourcer.ProjectResourcer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAOImpl extends AbstractDAO implements UserDAO {

    private static UserDAOImpl instance;
    @Override
    public List<User> findAll() {
        String query = resourcer.getString("user.find.all");
        List<User> users = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                users.add(DAOMapper.mapUser(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public User findUserById(Integer id) {
        String query = resourcer.getString("user.find.id");

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, id);
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                return DAOMapper.mapUser(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public User findUserByLogin(String login) {
        String query = ProjectResourcer.getInstance().getString("user.find.login");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, login);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return DAOMapper.mapUser(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Optional<User> updateUser(User user) {
        String query = resourcer.getString("user.update");

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setString(1, user.getLogin());
            st.setString(2, user.getPassword());
            st.setString(3, user.getFirstName());
            st.setString(4, user.getLastName());
            st.setString(5, user.getUserStatus().toString());
            st.setString(6, user.getUserRole().toString());
            st.setInt(7, user.getUserId());

            st.executeUpdate();

            return Optional.of(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    @Override
    public void deleteUser(User user) {
        String query = resourcer.getString("query.user.delete");

        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setInt(1, user.getUserId());

            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<User> save(User user) {
        String query = resourcer.getString("user.save");
        String[] returnId = {"id"};

        try (PreparedStatement st = connection.prepareStatement(query, returnId)) {
            st.setString(1, user.getLogin());
            st.setString(2, user.getPassword());
            st.setString(3, user.getFirstName());
            st.setString(4, user.getLastName());
            st.setString(5, user.getUserStatus().toString());
            st.setString(6, user.getUserRole().toString());

            int affectedRows = st.executeUpdate();

            if (affectedRows == 0) {
                return Optional.empty();
            }

            try (ResultSet generatedKeys = st.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);

                    user.setUserId(id);

                    return Optional.of(user);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public static UserDAOImpl getInstance() {
        synchronized (UserDAOImpl.class) {
            if (instance == null) {
                instance = new UserDAOImpl();
            }
        }
        return instance;
    }

}
