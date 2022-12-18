package ru.rsreu.nis.database.impl.oracle;

import resourcer.ProjectResourcer;
import ru.rsreu.nis.database.ConnectionPool;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class OracleUserDAO implements UserDAO {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        try (Connection connection = ConnectionPool.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(ProjectResourcer.getInstance().getString("user.auth"));
            ps.setString(1, login);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            return new User(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
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

//    @Override
//    public User getUserByLoginAndPassword(String login, String password) {
//        return null;
//    }
}
