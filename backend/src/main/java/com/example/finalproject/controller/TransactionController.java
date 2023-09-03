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


    @GetMapping
    public List<TransactionDto> getTransactionsInAccount(@RequestParam Long accountId) {
        return transactionService.getTransactionsInAccount(accountId)
            .stream()
            .map(transaction -> TransactionMapper.toDto(transaction, accountId))
            .toList();
    }

    @PostMapping()
    public void createTransaction (@RequestBody TransactionDto transactionDto) {
        transactionService.createTransaction(transactionMapper.toEntity(transactionDto));
    }

    @DeleteMapping("{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
    }

    @PutMapping("{id}")
    public void updateTransaction(@PathVariable Long id, @RequestBody TransactionDto transactionDto) {
//        Pair<Transaction, List<TransactionAccount>> toEntity = transactionMapper.toEntity(transactionDto);
//        toEntity.getFirst().setId(id);
//        transactionService.updateTransaction(toEntity);

    }
}
