package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.entity.enums.RequestStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    private Integer requestId;
    private User passenger;
    private Trip trip;
    private RequestStatus requestStatus;
}