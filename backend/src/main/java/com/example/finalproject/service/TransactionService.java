package com.example.finalproject.service;

import com.example.finalproject.model.transaction.Transaction;
import com.example.finalproject.model.transaction.TransactionAccount;
import com.example.finalproject.model.transaction.TransactionAccountKey;
import com.example.finalproject.repository.TransactionAccountRepository;
import com.example.finalproject.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    TransactionAccountRepository transactionAccountRepository;

    public void createTransaction(Pair<Transaction, TransactionAccount> transaction) {
        transactionRepository.save(transaction.getFirst());
        transaction.getSecond().setId(new TransactionAccountKey(transaction.getFirst().getId(), transaction.getSecond().getAccount().getId()));
        transactionAccountRepository.save(transaction.getSecond());
    }

    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }
}
