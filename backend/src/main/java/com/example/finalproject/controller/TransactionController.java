package com.example.finalproject.controller;

import com.example.finalproject.dto.TransactionDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
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
    @PostMapping()
    public void createTransaction (@RequestBody TransactionDto transactionDto) {

    }
}
