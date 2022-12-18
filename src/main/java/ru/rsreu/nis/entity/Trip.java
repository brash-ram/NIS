package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.entity.enums.TripStatus;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip {
    private Long tripId;
    private String startPoLong;
    private String finalPoLong;
    private Date tripDate;
    private Long freeSeats;
    private BigDecimal price;
    private Long driverId;
    private TripStatus tripStatus;
}
