package org.example.controller;

import org.example.constant.ErrorMessagesConstants;
import org.example.dto.ErrorMessageDto;
import org.example.exception.GeneralException;
import org.example.exception.InvalidUUIDException;
import org.example.exception.NotFoundException;
import org.example.exception.UnprocessableEntityException;
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

    @ExceptionHandler({GeneralException.class})
    public ResponseEntity<ErrorMessageDto> handleUnprocessableEntityException(GeneralException ex) {
        return new ResponseEntity<>(ex.getErrorMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({UnprocessableEntityException.class})
    public ResponseEntity<ErrorMessageDto> handleUnprocessableEntityException(UnprocessableEntityException ex) {
        return new ResponseEntity<>(ex.getErrorMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<ErrorMessageDto> handleNotFoundException(NotFoundException ex) {
        return new ResponseEntity<>(ex.getErrorMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorMessageDto> handleUnexpectedException(Exception ex) {
        return new ResponseEntity<>(new ErrorMessageDto(ErrorMessagesConstants.COMMON_ERROR + ex),
                HttpStatusCode.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }

    @ExceptionHandler({InvalidUUIDException.class})
    public ResponseEntity<ErrorMessageDto> handleInvalidUUIDException(InvalidUUIDException ex) {
        return new ResponseEntity<>(new ErrorMessageDto(ErrorMessagesConstants.INVALID_UUID + ex.getValue()),
                HttpStatusCode.valueOf(HttpStatus.UNPROCESSABLE_ENTITY.value()));
    }
}
