package com.example.finalproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GoalDto {
    private String goalType;
    private double currentAmount;
    private double goalAmount;
    private String name;
    private String payee;
    private Long userId;
    //private Long savingsAccountId; //moje da se promeni na ime na savings account
}
