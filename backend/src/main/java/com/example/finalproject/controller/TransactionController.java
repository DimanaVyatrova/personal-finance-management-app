package com.example.finalproject.controller;

import com.example.finalproject.dto.TransactionDto;
import com.example.finalproject.mapper.TransactionMapper;
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
    private TransactionService transactionService;
    private TransactionMapper transactionMapper;

    @GetMapping()
    public List<TransactionDto> getTransactions() {
        //return transactionService.getTransactions().stream();
        return null;
    }

    @PostMapping()
    public void createTransaction (@RequestBody TransactionDto transactionDto) {
        transactionService.createTransaction(transactionMapper.toEntity(transactionDto));
    }
}
