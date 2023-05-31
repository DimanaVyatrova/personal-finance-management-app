package com.example.finalproject.dto;

import com.example.finalproject.model.Budget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String email;
    private String username;
    private Set<CheckingAccountDto> checkingAccounts;
    private Set<Budget> budgets;
//    private byte[] profilePicture;
}
