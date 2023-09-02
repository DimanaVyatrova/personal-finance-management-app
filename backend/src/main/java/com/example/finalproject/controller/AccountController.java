package com.example.finalproject.controller;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.mapper.AccountMapper;
import com.example.finalproject.service.AccountService;
import com.example.finalproject.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("accounts")
public class AccountController {

    private AccountService accountService;
    private AccountMapper accountMapper;


    @PostMapping()
    public void createAccount(@RequestBody AccountDto accountDto) {
        accountService.create(accountMapper.toEntity(accountDto));
    }

    @GetMapping()
    public List<AccountDto> getAllAccounts() {
        return accountService.getAllAccounts().stream().map(accountMapper::toDto).toList();
    }

    @GetMapping("{id}")
    public AccountDto getAccountById(@PathVariable Long id) {
        return accountMapper.toDto(accountService.getAccountById(id));
    }

    /*@GetMapping("{type}")
    public List<AccountDto> getAccountsByType(@PathVariable String type) {

    }*/

    @PutMapping()
    public void updateAccount(@RequestBody AccountDto accountDto) {
        accountService.updateAccount(accountMapper.toEntity(accountDto));
    }

    @DeleteMapping("{id}")
    public void deleteAccountById(@PathVariable Long id) {
        accountService.deleteAccountById(id);
    }

    @GetMapping("/{id}")
    public String getAccountById(@PathVariable Long id) {
        return accountService.get(id);
    }

}
