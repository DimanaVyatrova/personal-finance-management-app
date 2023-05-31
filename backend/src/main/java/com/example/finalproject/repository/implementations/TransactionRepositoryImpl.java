package com.example.finalproject.repository.implementations;

import com.example.finalproject.dto.TransactionDto;
import com.example.finalproject.repository.TransactionRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {
    private Map<Long, TransactionDto> transactions = new HashMap<>();

    @Override
    public String create(TransactionDto transactionDto) {
        transactions.put(transactionDto.getId(), transactionDto);
        return transactions.get(transactionDto.getId()).toString();
    }

    @Override
    public String get(Long id) {
        return transactions.get(id).toString();
    }

    @Override
    public String getAccountTransactionsById(Long accountId) {
        String result = "";
        for(Map.Entry<Long, TransactionDto> t : transactions.entrySet()) {
            if (t.getValue().getAccountId() == accountId) {
                result += t.getValue().toString() + System.lineSeparator();
            }
        }
        return result;
    }
}
