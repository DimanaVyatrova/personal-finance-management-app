package com.example.finalproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TransactionDto {
    private Long amount;
    private String createdAt;
    private String period;
    private String transactionParty;
    private Long categoryId;
    private Long accountId;
    private String transactionType; //INCOME, EXPENSE
}
