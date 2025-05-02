package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.OrderEntity;
import org.example.exception.InvalidUUIDException;
import org.example.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * Контроллер эндпоинтов заказов.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping(value = "/by-user/{user}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OrderEntity>> getOrdersByUser(@PathVariable @NonNull final String user) {
        UUID userId;
        try {
            userId = UUID.fromString(user);
        } catch (IllegalArgumentException e) {
            throw new InvalidUUIDException(user);
        }

        return ResponseEntity.ok(orderService.getOrdersByUser(userId));
    }
}
