package ru.rsreu.nis.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    private int session_id;
    private int userId;
    private Date activeUntil;
    private String token;
}
