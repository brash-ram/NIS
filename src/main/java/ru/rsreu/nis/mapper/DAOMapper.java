package ru.rsreu.nis.mapper;

import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.RequestStatus;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.entity.enums.TripStatus;
import ru.rsreu.nis.entity.enums.UserStatus;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMapper {

    public static User mapUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getInt("user_id"),
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
                rs.getInt("session_id"),
                DAOMapper.mapUser(rs),
                rs.getTimestamp("active_until")
        );
    }

    public static Request mapRequest(ResultSet rs) throws SQLException {
        return new Request(
                rs.getInt("request_id"),
                DAOMapper.mapUser(rs),
                DAOMapper.mapTrip(rs),
                RequestStatus.valueOf(rs.getString("request_status"))
        );
    }

    private static Trip mapTrip(ResultSet rs)  throws SQLException {
        return new Trip(
                rs.getInt("trip_id"),
                rs.getString("first_point"),
                rs.getString("final_point"),
                rs.getTimestamp("trip_date"),
                rs.getInt("free_seats"),
                rs.getInt("price"),
                rs.getInt("driver_id"),
                TripStatus.valueOf( rs.getString("trip_status"))
        );
    }
}
