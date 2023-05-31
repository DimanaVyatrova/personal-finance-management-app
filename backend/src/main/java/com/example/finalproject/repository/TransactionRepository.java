package com.example.finalproject.repository;

import com.example.finalproject.dto.TransactionDto;

public interface TransactionRepository {
    public String create(TransactionDto transactionDto);
    public String get(Long id);
    public String getAccountTransactionsById(Long accountId);
}
