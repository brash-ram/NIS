package ru.rsreu.nis.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.myenums.UserStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int userId;
    private String login;
    private String password;
    private UserStatus userStatus;
    private String firstName;
    private String lastName;
}
