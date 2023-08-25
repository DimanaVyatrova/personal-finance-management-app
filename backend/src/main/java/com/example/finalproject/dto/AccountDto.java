package com.example.finalproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountDto {
    private Double balance;
    private String name;
    private String relationName; //if type == checking, this is username
                               //if type == saving, this is checkingAccount "parent" name
                               //if type == investment, this is checkingAccount "parent" name
    private String goalName;
    private String type; //checking, saving, investment

}
