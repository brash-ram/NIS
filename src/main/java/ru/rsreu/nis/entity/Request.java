package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.rsreu.nis.entity.enums.RequestStatus;

/** * Class that reflects the representation of the
 * Request Entity in the DB in the ORM style
 * @author Danila Rudi
 * @author Maxim Starostin
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Request {
    private Integer requestId;
    private User passenger;
    private Trip trip;
    private RequestStatus requestStatus;

    public Request(User passenger, Trip trip, RequestStatus requestStatus) {
        this.passenger = passenger;
        this.trip = trip;
        this.requestStatus = requestStatus;
    }
}