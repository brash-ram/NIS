package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.sql.Date;
import java.sql.Timestamp;

/** * Class that reflects the representation of the
 * Session Entity in the DB in the ORM style
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Session {
    private Integer session_id;
    private User user;
    private Timestamp activeUntil;

    public Session(User user, Timestamp activeUntil) {
        this.user = user;
        this.activeUntil = activeUntil;
    }
}
