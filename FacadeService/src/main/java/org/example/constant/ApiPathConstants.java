package org.example.constant;

import lombok.experimental.UtilityClass;

/**
 * Эндпоинты внешних апи.
 */
@UtilityClass
public class ApiPathConstants {

    public static final String USER_SERVICE_GET_USER_BY_ID = "/api/users/{userId}";
    public static final String ORDER_SERVICE_GET_ORDERS_BY_USER_ID = "/api/orders/by-user/{user}";
}
