package com.example.finalproject.service;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.dto.TransactionDto;
import com.example.finalproject.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionService {
    private TransactionRepository transactionRepository;

    public String create(TransactionDto transactionDto) {
        return transactionRepository.create(transactionDto);
    }

    public String get(Long id) {
        return transactionRepository.get(id);
    }

    public String getAccountTransactionsById(Long id) {
        return transactionRepository.getAccountTransactionsById(id);
    }
}
