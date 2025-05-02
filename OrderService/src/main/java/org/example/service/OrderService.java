package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.OrderEntity;
import org.example.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Сервис работы с заказами.
 */
@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    /**
     * Получить заказы по заданному идентификатору пользователя.
     *
     * @param userId идентификатор пользователя
     * @return список заказов
     */
    @Transactional(readOnly = true)
    public List<OrderEntity> getOrdersByUser(UUID userId) {
        return orderRepository.findAllByUserId(userId);
    }
}
