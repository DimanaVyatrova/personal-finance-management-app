package com.example.finalproject.service;

import com.example.finalproject.model.transaction.Transaction;
import com.example.finalproject.model.transaction.TransactionAccount;
import com.example.finalproject.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionAccountService transactionAccountService;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository,
                              TransactionAccountService transactionAccountService) {
        this.transactionRepository = transactionRepository;
        this.transactionAccountService = transactionAccountService;
    }

    public void createTransaction(Pair<Transaction, List<TransactionAccount>> transaction) {
        transactionRepository.save(transaction.getFirst());
        transaction.getSecond().forEach(transactionAccount -> {transactionAccountService.save(transactionAccount);});
    }


    public List<Transaction> getTransactionsInAccount(Long accountId) {
        return transactionRepository.findAllByIdIn(transactionAccountService.findTransactionIdsByAccountId(accountId));
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }

    public void updateTransaction(Pair<Transaction, List<TransactionAccount>> toEntity) {
//        transactionRepository.save(toEntity.getFirst());
//        toEntity.getSecond().forEach(transactionAccount -> transactionAccountService.update(transactionAccount));

    }
}
