package com.example.finalproject.controller;

import com.example.finalproject.dto.TransactionDto;
import com.example.finalproject.model.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("transactions")
public class TransactionController {

    //връща транзакциите за акаунт със съответното id
    @GetMapping("{id}")
    //List<TransactionDto>
    public String getTransactions() {
        return "Opita se :(";
    }

    //добавя транзакция към акаунт със съответното id
    @PostMapping("{id}")
    public Long addTransaction (@RequestBody TransactionDto transactionDto) {
        return 0L;
    }
}
