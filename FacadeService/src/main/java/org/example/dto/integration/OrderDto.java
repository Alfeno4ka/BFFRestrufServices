package org.example.dto.integration;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * Интеграционная модель данных заказа.
 */
@Data
public class OrderDto {
    private UUID id;
    private UUID userId;
    private BigDecimal amount;
    private String currency;
    private List<OrderEntryDto> orderEntries;
}
