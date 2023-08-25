package com.example.finalproject.service;

import com.example.finalproject.model.User;
import com.example.finalproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Long id) {
        System.out.println("This is the Id : " + id);
        if (userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get();
        }
        throw new RuntimeException();
    }

    public User getUserByName(String name) {
        return getUserById(userRepository.findByUsername(name).getId());
    }
}
