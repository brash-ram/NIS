package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/** * Class that reflects the representation of the
 * Mark Entity in the DB in the ORM style
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Mark {
    private Integer markId;
    private User fromUser;
    private Integer toUser;
    private Integer mark;
    private Trip trip;

    public Mark(User fromUser, Integer toUser, Integer mark, Trip trip) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.mark = mark;
        this.trip = trip;
    }

    public Mark(Integer mark, Trip trip) {
        this.mark = mark;
        this.trip = trip;
    }
}
