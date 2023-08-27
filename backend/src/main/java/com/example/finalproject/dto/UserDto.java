package com.example.finalproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String email;
    private String password;
    private String username;
    private byte[] profilePicture;
}
