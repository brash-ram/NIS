package ru.rsreu.nis.database.impl;

import ru.rsreu.nis.database.AbstractDAO;
import ru.rsreu.nis.mapper.DAOMapper;
import ru.rsreu.nis.resourcer.ProjectResourcer;
import ru.rsreu.nis.database.ConnectionPool;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl extends AbstractDAO implements UserDAO {

    private static UserDAOImpl instance;
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        try {
            PreparedStatement ps = connection.prepareStatement(ProjectResourcer.getInstance().getString("user.auth"));
            ps.setString(1, login);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            return DAOMapper.mapUser(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserById(Long id) {
        String query = resourcer.getString("user.get");
        List<User> users = new ArrayList<>();

        try (PreparedStatement st = connection.prepareStatement(query)) {
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                users.add(DAOMapper.mapUser(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        String query = ProjectResourcer.getInstance().getString("user.auth");
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
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void addUser(User user) {

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
