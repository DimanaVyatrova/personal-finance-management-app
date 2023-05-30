package com.example.finalproject.controller;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("accounts")
public class AccountController {

    private AccountService accountService;

    @PostMapping()
    public String addAccount(@RequestBody AccountDto accountDto) {
        return accountService.create(accountDto);
    }
}
