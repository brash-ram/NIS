package ru.rsreu.nis.mapper;

import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.entity.enums.UserStatus;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMapper {

    public static User mapUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("user_id"),
                rs.getString("login"),
                rs.getString("password"),
                UserStatus.valueOf(rs.getString("user_status")),
                rs.getString("first_name"),
                rs.getString("last_name"),
                Roles.valueOf(rs.getString("user_role"))
        );
    }

    public static Session mapSession(ResultSet rs) throws SQLException {
        return new Session(
                rs.getLong("session_id"),
                DAOMapper.mapUser(rs),
                rs.getTimestamp("activeUntil")
        );
    }
}
