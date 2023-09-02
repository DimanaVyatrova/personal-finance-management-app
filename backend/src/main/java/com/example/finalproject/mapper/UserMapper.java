package com.example.finalproject.mapper;

import com.example.finalproject.dto.UserDto;
import com.example.finalproject.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .email(userDto.getEmail())
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .profilePicture(userDto.getProfilePicture())
                .checkingAccounts(null)
               // .budgets(null)
                .build();
    }
}
