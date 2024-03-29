package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.rsreu.nis.entity.enums.TripStatus;

import java.sql.Date;

/** * Class that reflects the representation of the
 * Trip Entity in the DB in the ORM style
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Trip {
    private Integer tripId;
    private String startPoint;
    private String finalPoint;
    private Date tripDate;
    private Integer freeSeats;
    private Integer price;
    private Integer driverId;
    private TripStatus tripStatus;

}
