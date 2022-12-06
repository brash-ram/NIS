package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.enums.UserStatus;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long userId;
    private String login;
    private String password;
    private UserStatus userStatus;
    private String firstName;
    private String lastName;

    public User(ResultSet rs) throws SQLException {
        userId = rs.getLong("userId");
        login = rs.getString("login");
        password = rs.getString("password");
        userStatus = UserStatus.valueOf(rs.getString("userStatus"));
        firstName = rs.getString("firstName");
        lastName = rs.getString("lastName");
    }
}
