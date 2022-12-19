package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.entity.enums.UserStatus;

import javax.security.auth.Subject;
import java.security.Principal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  implements Principal {
    private Long userId;
    private String login;
    private String password;
    private UserStatus userStatus;
    private String firstName;
    private String lastName;
    private Roles userRole;


    @Override
    public String getName() {
        return login;
    }

    @Override
    public boolean implies(Subject subject) {
        return Principal.super.implies(subject);
    }
}
