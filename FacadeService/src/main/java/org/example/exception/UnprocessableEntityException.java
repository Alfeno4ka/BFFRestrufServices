package org.example.exception;

import lombok.Getter;
import org.example.dto.ErrorMessageDto;

/**
 * Невалидные данные.
 */
@Getter
public class UnprocessableEntityException extends RuntimeException {

    private ErrorMessageDto errorMessage;

    public UnprocessableEntityException(ErrorMessageDto errorMessage) {
        this.errorMessage = errorMessage;
    }
}
