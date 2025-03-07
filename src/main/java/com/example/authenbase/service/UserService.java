package com.example.authenbase.service;

import com.example.authenbase.entity.User;

public interface UserService {
    boolean existByUsername(String username);
    boolean existByEmail(String email);
    void save(User user);

}
