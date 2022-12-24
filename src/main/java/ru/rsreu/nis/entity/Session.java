package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.rsreu.nis.entity.enums.SessionStatus;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Session {
    private Integer session_id;
    private User user;
    private Date activeUntil;
    private SessionStatus status;

    public Session(User user, Date activeUntil) {
        this.user = user;
        this.activeUntil = activeUntil;
    }

    public Session(Integer session_id, User user, Date activeUntil) {
        this.session_id = session_id;
        this.user = user;
        this.activeUntil = activeUntil;
    }
}
