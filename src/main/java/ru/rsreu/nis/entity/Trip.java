package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.entity.enums.TripStatus;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
