package com.example.finalproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TransactionDto {
    private Long id;
    private Long amount;
    private LocalDate createdAt;
    private String period;
    private String transactionParty;
    private Long categoryId;
}
