package com.example.finalproject.mapper;

import com.example.finalproject.dto.TransactionDto;
import com.example.finalproject.model.RecurringPeriod;
import com.example.finalproject.model.transaction.Transaction;
import com.example.finalproject.model.transaction.TransactionAccount;
import com.example.finalproject.model.transaction.TransactionType;
import com.example.finalproject.service.AccountService;
import com.example.finalproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class TransactionMapper {
    private final CategoryService categoryService;
    private final AccountService accountService;

    @Autowired
    public TransactionMapper(CategoryService categoryService, AccountService accountService) {
        this.categoryService = categoryService;
        this.accountService = accountService;
    }

    public Pair<Transaction, List<TransactionAccount>> toEntity(TransactionDto transactionDto) {
        RecurringPeriod recurringPeriod = null;
        if (transactionDto.getPeriod() != null) {
            recurringPeriod = RecurringPeriod.valueOf(transactionDto.getPeriod().toUpperCase());
        }

        Transaction transaction = new Transaction();
        transaction.setAmount(transactionDto.getAmount());
        transaction.setPeriod(recurringPeriod);

        if (transactionDto.getCategoryId() != null) {
            transaction.setCategory(categoryService.getCategoryById(transactionDto.getCategoryId()));
        }
        transaction.setTransactionParty(transactionDto.getTransactionParty());
        transaction.setCreatedAt(LocalDate.parse(transactionDto.getCreatedAt()));

        TransactionAccount transactionAccount = new TransactionAccount();
        transactionAccount.setAccount(accountService.getAccountById(transactionDto.getFirstAccountId()));
        transactionAccount.setTransaction(transaction);

        TransactionType transactionType = TransactionType.valueOf(transactionDto.getTransactionType());
        transactionAccount.setTransactionType(transactionType);
        List<TransactionAccount> transactionAccounts = List.of(transactionAccount);

        if (transactionDto.getOptionalAccountId() != null) {
            TransactionAccount optionalTransactionAccount = new TransactionAccount();
            optionalTransactionAccount.setAccount(accountService.getAccountById(transactionDto.getFirstAccountId()));
            optionalTransactionAccount.setTransaction(transaction);
            optionalTransactionAccount.setTransactionType(transactionType);

            transactionAccounts.add(optionalTransactionAccount);
        }

        return Pair.of(transaction, transactionAccounts);
    }

    public static TransactionDto toDto(Transaction transaction, Long firstAccountId) {
        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setTransactionParty(transaction.getTransactionParty());
        transactionDto.setId(transaction.getId());
        transactionDto.setPeriod(transaction.getPeriod().toString());
        transactionDto.setAmount(transaction.getAmount());
        transactionDto.setCreatedAt(transaction.getCreatedAt().toString());
        transactionDto.setCategoryId(transaction.getCategory().getId());
        transactionDto.setFirstAccountId(firstAccountId);
        transaction.getTransactionAccounts().forEach(transactionAccount -> {
            if (!transactionAccount.getAccount().getId().equals(firstAccountId)) {
                transactionDto.setOptionalAccountId(transactionAccount.getAccount().getId());
            } else {
                transactionDto.setTransactionType(transactionAccount.getTransactionType().toString());
            }
        });

        return transactionDto;
    }
}