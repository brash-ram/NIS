package ru.rsreu.nis.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.myenums.TripStatus;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip {
    private int tripId;
    private String startPoint;
    private String finalPoint;
    private Date tripDate;
    private int freeSeats;
    private BigDecimal price;
    private int driverId;
    private TripStatus tripStatus;
}
