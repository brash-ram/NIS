package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.enums.UserStatus;

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
}
