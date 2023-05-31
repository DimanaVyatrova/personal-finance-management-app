package com.example.finalproject.service;

import com.example.finalproject.model.User;


public interface UserService {
    User getUserByUsername(String username);
    User addUser(User user);
}
