package org.example.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Конфигурация.
 */
@Configuration
@RequiredArgsConstructor
public class CommonApplicationConfig {

    private final RestTemplateBuilder restTemplateBuilder;
    private final ApplicationRestErrorHandler applicationRestErrorHandler;

    @Bean
    public RestTemplate restTemplate() {
        return restTemplateBuilder
                .errorHandler(applicationRestErrorHandler)
                .build();
    }
}
