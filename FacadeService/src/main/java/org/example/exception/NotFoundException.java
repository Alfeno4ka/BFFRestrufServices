package org.example.exception;

import lombok.Getter;
import org.example.dto.ErrorMessageDto;

/**
 * Исключение когда ресурс не найден.
 */
@Getter
public class NotFoundException extends RuntimeException {

    private ErrorMessageDto errorMessage;

    public NotFoundException(ErrorMessageDto errorMessage) {
        this.errorMessage = errorMessage;
    }
}
