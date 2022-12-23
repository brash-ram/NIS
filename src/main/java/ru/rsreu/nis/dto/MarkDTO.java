package ru.rsreu.nis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rsreu.nis.entity.Mark;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarkDTO {
    private User user;
    private Trip trip;
    private Mark mark;
}
