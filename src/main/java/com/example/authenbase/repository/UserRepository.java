package com.example.authenbase.repository;

import com.example.authenbase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

    Optional<Object> findByEmail(String email);
}
