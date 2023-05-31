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
    private String createdAt;
    private Long amount;
    private Long reccuringId;
    private String stakeholder;
    private String category;

    @Override
    public String toString() {
        return "TransactionDto{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", type='" + type + '\'' +
                ", createdAt=" + createdAt +
                ", amount=" + amount +
                ", reccuringId=" + reccuringId +
                ", stakeholder='" + stakeholder + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
