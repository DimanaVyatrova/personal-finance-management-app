package com.example.finalproject.service;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountService {
    private AccountRepository accountRepository;

    public String create(AccountDto accountDto) {
        return accountRepository.create(accountDto);
    }
}
