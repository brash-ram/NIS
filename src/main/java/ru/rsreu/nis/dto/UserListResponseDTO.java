package ru.rsreu.nis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.SessionStatus;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserListResponseDTO {
    private Integer session_id;
    private User user;
    private Date activeUntil;
    private SessionStatus status;
}
