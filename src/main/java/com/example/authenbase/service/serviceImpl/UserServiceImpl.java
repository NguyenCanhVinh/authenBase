package com.example.authenbase.service.serviceImpl;

import com.example.authenbase.entity.User;
import com.example.authenbase.repository.UserRepository;
import com.example.authenbase.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean existByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public boolean existByEmail(String email) {
        return userRepository.existsByEmail(email);
    }


    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
