package com.example.finalproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TransactionDto {
    private Long amount;
    private String createdAt;
    private String period;
    private String transactionParty;
    private Long categoryId;
    private Long firstAccountId;
    private Long optionalAccountId;
    private String transactionType; //INCOME, EXPENSE
//    private Boolean isIncome;
    private Long id;
}
