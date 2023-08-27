package com.example.finalproject.mapper;

import com.example.finalproject.dto.TransactionDto;
import com.example.finalproject.model.RecurringPeriod;
import com.example.finalproject.model.transaction.Transaction;
import com.example.finalproject.model.transaction.TransactionAccount;
import com.example.finalproject.model.transaction.TransactionType;
import com.example.finalproject.service.AccountService;
import com.example.finalproject.service.CategoryService;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TransactionMapper {
    private final CategoryService categoryService;
    private final AccountService accountService;

    public TransactionMapper(CategoryService categoryService, AccountService accountService) {
        this.categoryService = categoryService;
        this.accountService = accountService;
    }

    public Pair<Transaction, TransactionAccount> toEntity(TransactionDto transactionDto) {
        RecurringPeriod recurringPeriod = null;
        if (transactionDto.getPeriod() != null) {
            if (transactionDto.getPeriod().equals("monthly")) {
                recurringPeriod = RecurringPeriod.MONTHLY;
            }
            else if (transactionDto.getPeriod().equals("annualy")) {
                recurringPeriod = RecurringPeriod.ANNUALLY;
            }
            else if (transactionDto.getPeriod().equals("weekly")) {
                recurringPeriod = RecurringPeriod.WEEKLY;
            }
            else if (transactionDto.getPeriod().equals("quaterly")) {
                recurringPeriod = RecurringPeriod.QUARTERLY;
            }
        }


        Transaction transaction = new Transaction();
        transaction.setAmount(transactionDto.getAmount());
        transaction.setPeriod(recurringPeriod);
        transaction.setCategory(categoryService.getCategoryById(transactionDto.getCategoryId()));
        transaction.setTransactionParty(transactionDto.getTransactionParty());
        transaction.setCreatedAt(LocalDate.parse(transactionDto.getCreatedAt()));

        TransactionAccount transactionAccount = new TransactionAccount();
        transactionAccount.setAccount(accountService.getAccountById(transactionDto.getAccountId()));
        transactionAccount.setTransaction(transaction);

        TransactionType transactionType = null;
        if (transactionDto.getTransactionType().equals("INCOME")) {
            transactionType = TransactionType.INCOME;
        }
        if (transactionDto.getTransactionType().equals("EXPENSE")) {
            transactionType = TransactionType.EXPENSE;
        }
        transactionAccount.setTransactionType(transactionType);

        return Pair.of(transaction, transactionAccount);
    }
}
