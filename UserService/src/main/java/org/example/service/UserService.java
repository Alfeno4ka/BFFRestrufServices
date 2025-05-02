package org.example.service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.example.entity.UserEntity;
import org.example.exception.UserNotFoundException;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

/**
 * Сервис работы с пользователями.
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public UserEntity getUser(UUID userId) {
        Optional<UserEntity> optionalUser = userRepository.findById(userId);

        if (optionalUser.isEmpty()) {
            throw new UserNotFoundException(userId);
        }

        return optionalUser.get();
    }
}
