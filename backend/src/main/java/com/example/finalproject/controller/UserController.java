package com.example.finalproject.controller;

import com.example.finalproject.dto.UserDto;
import com.example.finalproject.model.User;
import com.example.finalproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("users")
public class UserController {
    private UserService userService;
    private ModelMapper modelMapper;

    @Autowired
    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{username}")
    public UserDto getUser(@PathVariable String username) {
        User user = userService.getUserByUsername(username);
        return modelMapper.map(user, UserDto.class);
    }

}
