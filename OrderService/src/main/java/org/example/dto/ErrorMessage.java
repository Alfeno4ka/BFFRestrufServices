package org.example.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Value;

/**
 * ДТО сообщения об ошибке.
 */
@Getter
public class ErrorMessage {
    String code;
    String message;

    public ErrorMessage(String message) {
        this.code = message.substring(0, 4);
        this.message = message.substring(5);
    }
}
