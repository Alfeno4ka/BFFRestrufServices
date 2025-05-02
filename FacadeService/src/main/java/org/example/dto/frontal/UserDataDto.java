package org.example.dto.frontal;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.List;
import java.util.UUID;

/**
 * Фронтальна модель данных о пользователе.
 */
@Data
public class UserDataDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String deliveryAddress;
    private List<OrderDataDto> orders;
}
