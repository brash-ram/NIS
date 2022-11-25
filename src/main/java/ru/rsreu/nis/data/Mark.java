package ru.rsreu.nis.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mark {
    private int markId;
    private int fromUser;
    private int toUser;
    private int mark;
}
