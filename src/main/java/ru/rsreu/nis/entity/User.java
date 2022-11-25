package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.rsreu.nis.enums.Status;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class User {
    private Long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Status userStatus;
}
