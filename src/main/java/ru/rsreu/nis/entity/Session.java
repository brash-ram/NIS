package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Session {
    private Integer session_id;
    private User user;
    private Date activeUntil;

    public Session(User user, Date activeUntil) {
        this.user = user;
        this.activeUntil = activeUntil;
    }
}
