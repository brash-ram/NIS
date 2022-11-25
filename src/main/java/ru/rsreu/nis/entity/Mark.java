package ru.rsreu.nis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mark {
    private Long markId;
    private Long fromUser;
    private Long toUser;
    private Long mark;
}
