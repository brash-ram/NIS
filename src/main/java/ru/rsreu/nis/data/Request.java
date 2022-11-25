package ru.rsreu.nis.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.myenums.RequestStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    private int requestId;
    private int passengerId;
    private int tripId;
    private RequestStatus requestStatus;
}