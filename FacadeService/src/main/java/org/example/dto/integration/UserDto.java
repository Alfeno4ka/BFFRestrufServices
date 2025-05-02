package org.example.dto.integration;

import lombok.Data;

import java.util.List;
import java.util.UUID;

/**
 * Интеграционная модель данных пользователя.
 */
@Data
public class UserDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String deliveryAddress;
}
