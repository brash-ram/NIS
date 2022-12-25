package ru.rsreu.nis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarkDTO {
    private String startPoint;
    private String finalPoint;
    private Date tripDate;
    private Integer mark;
}
