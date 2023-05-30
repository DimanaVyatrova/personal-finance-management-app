package com.example.finalproject.repository;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.model.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    List<AccountDto> accounts = new ArrayList<>();
    @Override
    public String create(AccountDto accountDto) {
        accounts.add(accountDto);
        return accounts.get(0).toString();
    }


}
