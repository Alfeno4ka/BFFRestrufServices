package org.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.ErrorMessageDto;
import org.example.exception.GeneralException;
import org.example.exception.NotFoundException;
import org.example.exception.UnprocessableEntityException;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;

/**
 * Обработчик ошибок от внешних АПИ.
 */
@Component
@RequiredArgsConstructor
public class ApplicationRestErrorHandler extends DefaultResponseErrorHandler {

    private final ObjectMapper objectMapper;

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().is5xxServerError() ||
                response.getStatusCode().is4xxClientError();
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        String errorMessageBody = new String(response.getBody().readAllBytes());

        ErrorMessageDto errorMessageDto = objectMapper.readValue(errorMessageBody, ErrorMessageDto.class);

        switch (response.getStatusCode().value()) {
            case 404 -> throw new NotFoundException(errorMessageDto);
            case 422 -> throw new UnprocessableEntityException(errorMessageDto);
            default -> throw new GeneralException(errorMessageDto);
        }
    }
}
