package com.example.finalproject.controller;

import com.example.finalproject.dto.TransactionDto;
import com.example.finalproject.model.Transaction;
import com.example.finalproject.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("transactions")
public class TransactionController {
    TransactionService transactionService;

    @GetMapping("{id}")
    //List<TransactionDto>
    public String getTransactionById(@PathVariable Long id) {
        return transactionService.get(id);
    }

    @PostMapping()
    public String addTransaction (@RequestBody TransactionDto transactionDto) {
        return transactionService.create(transactionDto);
    }
}
