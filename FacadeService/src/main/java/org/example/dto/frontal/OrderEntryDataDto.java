package org.example.dto.frontal;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.UUID;

/**
 * Интеграционная модель данных позиции заказа.
 */
@Data
public class OrderEntryDataDto {
    private UUID id;
    private UUID orderId;
    private Integer positionNumber;
    private String positionName;
    private Integer quantity;
}
