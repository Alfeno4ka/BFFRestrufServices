package org.example.exception;

import lombok.Getter;
import org.example.constant.ErrorMessagesConstants;

/**
 * Исключение при невалидном UUID.
 */
@Getter
public class InvalidUUIDException extends RuntimeException {

    private final String value;

    public InvalidUUIDException(String value) {
        super(ErrorMessagesConstants.INVALID_UUID + value);
        this.value = value;
    }
}
