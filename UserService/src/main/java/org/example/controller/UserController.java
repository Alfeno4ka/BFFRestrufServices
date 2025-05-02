package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.UserEntity;
import org.example.exception.InvalidUUIDException;
import org.example.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/api/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserEntity> getUser(@PathVariable @NonNull String userId) {
        UUID userIdUuid;
        try {
            userIdUuid = UUID.fromString(userId);
        } catch (IllegalArgumentException e) {
            throw new InvalidUUIDException(userId);
        }

        return ResponseEntity.ok(userService.getUser(userIdUuid));
    }
}
