package org.example.dto.integration;

import lombok.Data;

import java.util.UUID;

/**
 * Интеграционная модель данных позиции заказа.
 */
@Data
public class OrderEntryDto {

    private UUID id;
    private UUID orderId;
    private Integer positionNumber;
    private String positionName;
    private Integer quantity;
}
