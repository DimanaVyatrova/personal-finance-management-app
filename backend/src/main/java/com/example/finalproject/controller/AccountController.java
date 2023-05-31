package com.example.finalproject.controller;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.service.AccountService;
import com.example.finalproject.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("accounts")
public class AccountController {

    private AccountService accountService;
    private TransactionService transactionService;

    @PostMapping()
    public String addAccount(@RequestBody AccountDto accountDto) {
        return accountService.create(accountDto);
    }

    @GetMapping("/{id}")
    public String getAccountById(@PathVariable Long id) {
        return accountService.get(id);
    }

    //GET транзакциите на акаунт със съответното id
    @GetMapping("{id}/transactions")
    //List<TransactionDto>
    public String getTransactionById(@PathVariable Long id) {
        return transactionService.getAccountTransactionsById(id);
    }
}
