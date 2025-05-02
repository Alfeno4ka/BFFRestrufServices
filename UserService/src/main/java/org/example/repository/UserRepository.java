package org.example.repository;

import org.example.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Репозиторий управления сущностью {@link UserEntity}.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
