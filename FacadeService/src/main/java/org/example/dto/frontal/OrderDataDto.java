package org.example.dto.frontal;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.example.dto.integration.OrderEntryDto;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * Интеграционная модель данных заказа.
 */
@Data
public class OrderDataDto {
    private UUID id;
    private UUID userId;
    private BigDecimal amount;
    private String currency;
    private List<OrderEntryDataDto> orderEntries;
}
