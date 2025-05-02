package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.constant.ApiPathConstants;
import org.example.dto.frontal.UserDataDto;
import org.example.dto.integration.OrderDto;
import org.example.dto.integration.UserDto;
import org.example.mapper.UserDataMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Сервис получения данных о пользователе.
 */
@Service
@RequiredArgsConstructor
public class FacadeUserDataService {

    private final UserDataMapper userDataMapper;

    @Value("${integration.user-service.host}")
    private String userServiceHost;

    @Value("${integration.order-service.host}")
    private String orderServiceHost;

    private final RestTemplate restTemplate;

    public UserDataDto getUserData(UUID userId) {
        UserDto userData = getUser(userId);
        List<OrderDto> userOrders = getOrdersByUserId(userId);

        return userDataMapper.mapToUserDataDto(userData, userOrders);
    }

    private UserDto getUser(UUID userId) {
        return restTemplate.getForEntity(
                userServiceHost + ApiPathConstants.USER_SERVICE_GET_USER_BY_ID,
                UserDto.class,
                userId).getBody();
    }

    private List<OrderDto> getOrdersByUserId(UUID userId) {
        return List.of(Objects.requireNonNull(restTemplate.getForEntity(
                orderServiceHost + ApiPathConstants.ORDER_SERVICE_GET_ORDERS_BY_USER_ID,
                OrderDto[].class,
                userId).getBody()));
    }
}
