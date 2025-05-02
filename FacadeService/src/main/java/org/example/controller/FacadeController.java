package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.frontal.UserDataDto;
import org.example.exception.InvalidUUIDException;
import org.example.exception.UnprocessableEntityException;
import org.example.service.FacadeUserDataService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/site-bff")
public class FacadeController {

    private final FacadeUserDataService facadeUserDataService;

    @GetMapping(value = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDataDto> getUserData(@PathVariable @NonNull String userId) {
        UUID userIdUuid;
        try {
            userIdUuid = UUID.fromString(userId);
        } catch (IllegalArgumentException e) {
            throw new InvalidUUIDException(userId);
        }

        return ResponseEntity.ok(facadeUserDataService.getUserData(userIdUuid));
    }
}
