package org.example.controller;

import org.example.constant.ErrorMessagesConstants;
import org.example.dto.ErrorMessage;
import org.example.exception.InvalidUUIDException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Обработчик исключений.
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorMessage> handleUnexpectedException(Exception ex) {
        return new ResponseEntity<>(new ErrorMessage(ErrorMessagesConstants.COMMON_ERROR + ex),
                HttpStatusCode.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }

    @ExceptionHandler({InvalidUUIDException.class})
    public ResponseEntity<ErrorMessage> handleInvalidUUIDException(InvalidUUIDException ex) {
        return new ResponseEntity<>(new ErrorMessage(ErrorMessagesConstants.INVALID_UUID + ex.getValue()),
                HttpStatusCode.valueOf(HttpStatus.UNPROCESSABLE_ENTITY.value()));
    }
}
