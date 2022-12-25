package ru.rsreu.nis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.entity.User;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarkDTO {
    private User fromUser;
    private Integer toUser;
    private Integer mark;
    private Trip trip;
    private Float averageMark;
}
