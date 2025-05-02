package org.example.exception;

import lombok.Getter;
import org.example.dto.ErrorMessageDto;

/**
 * Неожиданная ошибка.
 */
@Getter
public class GeneralException extends RuntimeException {

    private ErrorMessageDto errorMessage;

    public GeneralException(ErrorMessageDto errorMessage) {
        this.errorMessage = errorMessage;
    }
}
