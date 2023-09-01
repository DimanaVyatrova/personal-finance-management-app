package com.example.finalproject.service;

import com.example.finalproject.model.transaction.TransactionAccount;
import com.example.finalproject.repository.TransactionAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionAccountService {
    private final TransactionAccountRepository transactionAccountRepository;

    @Autowired
    public TransactionAccountService(TransactionAccountRepository transactionAccountRepository) {
        this.transactionAccountRepository = transactionAccountRepository;
    }


    public void save(TransactionAccount transactionAccount) {
        transactionAccountRepository.save(transactionAccount);
    }

    public List<Long> findTransactionIdsByAccountId(Long accountId) {
        return transactionAccountRepository.findAllByAccountIdIs(accountId);
    }

    public void update(TransactionAccount transactionAccount) {
//        TransactionAccount before = transactionAccountRepository
//            .findTransactionAccountByAccount_IdAndTransactionId(transactionAccount.getAccount().getId(),
//                transactionAccount.getTransaction().getId());
//        transactionAccount.setId(before.getId());
//        transactionAccountRepository.save(transactionAccount);
    }
