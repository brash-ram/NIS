package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.entity.enums.UserStatus;

import javax.security.auth.Subject;
import java.security.Principal;

/** * Class that reflects the representation of the
 * User Entity in the DB in the ORM style
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
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
