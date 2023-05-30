package com.example.finalproject.model;

import java.time.LocalDate;

public class Transaction {
    private Long id;
    private Long accountId;
    private String type;
    private LocalDate createdAt;
    private Long amount;
    private Long reccuringId;
    private String stakeholder;
    private String category;
}
