package com.example.finalproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TransactionDto {
    private Long id;
    private Long accountId;
    private String type;
    private LocalDate createdAt;
    private Long amount;
    private Long reccuringId;
    private String stakeholder;
    private String category;
}
