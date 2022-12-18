package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.entity.enums.RequestStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    private Long requestId;
    private Long passengerId;
    private Long tripId;
    private RequestStatus requestStatus;
}