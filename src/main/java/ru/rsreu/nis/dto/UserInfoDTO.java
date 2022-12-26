package ru.rsreu.nis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.entity.enums.UserStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserInfoDTO {
    private String firstName;
    private String lastName;
    private Float averageMark;
}
