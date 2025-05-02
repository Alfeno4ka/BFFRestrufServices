package org.example.repository;

import org.example.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Репозиторий для управления с сущностью {@link OrderEntity}.
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {

    /**
     * Извлечь все {@link OrderEntity} по заданному userId.
     *
     * @param userId идентификатор пользователя
     * @return список заказов
     */
    List<OrderEntity> findAllByUserId(UUID userId);
}
