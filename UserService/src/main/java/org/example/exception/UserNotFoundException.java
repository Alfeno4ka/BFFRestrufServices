package org.example.exception;

import lombok.Getter;
import org.example.constant.ErrorMessagesConstants;

import java.util.UUID;

/**
 * Исключение когда пользователь не найден по айди.
 */
@Getter
public class UserNotFoundException extends RuntimeException {

    private UUID userId;

    public UserNotFoundException(UUID userId) {
        super(ErrorMessagesConstants.USER_NOT_FOUND + userId);
        this.userId = userId;
    }
}
