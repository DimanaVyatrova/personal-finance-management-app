package com.example.finalproject.controller;

import com.example.finalproject.dto.UserDto;
import com.example.finalproject.mapper.UserMapper;
import com.example.finalproject.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("users")
public class UserController {
    UserService userService;
    UserMapper mapper;
    @PostMapping()
    public void createUser(@RequestBody UserDto userDto) {
        userService.addUser(mapper.toEntity(userDto));
    }

    @GetMapping("{id}")
    public void getUserById(@PathVariable Long id) {

    }

}
