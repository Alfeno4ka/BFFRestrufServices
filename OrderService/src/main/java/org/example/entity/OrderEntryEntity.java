package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * Сущность "Позиция заказа".
 */
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "bff_restful_services", name = "dat_order_entries")
public class OrderEntryEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "order_id", nullable = false)
    private UUID orderId;

    @Column(name = "position_number", nullable = false)
    private Integer positionNumber;

    @Column(name = "position_name", nullable = false)
    private String positionName;

    @Column(name = "position_quantity")
    private Integer quantity;
}
