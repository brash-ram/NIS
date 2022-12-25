package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.entity.enums.UserStatus;

import javax.security.auth.Subject;
import java.security.Principal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Principal {
    private Integer userId;
    private String login;
    private String password;
    private UserStatus userStatus;
    private String firstName;
    private String lastName;
    private Roles userRole;

    public User(String login, String password, UserStatus userStatus,
                String firstName, String lastName, Roles userRole) {
        this.login = login;
        this.password = password;
        this.userStatus = userStatus;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRole;
    }

    @Override
    public boolean implies(Subject subject) {
        return Principal.super.implies(subject);
    }

    @Override
    public String getName() {
        return login;
    }
}
