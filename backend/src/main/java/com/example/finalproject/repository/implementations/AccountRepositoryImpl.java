package com.example.finalproject.repository.implementations;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.model.Account;
import com.example.finalproject.repository.AccountRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    List<AccountDto> accounts = new ArrayList<>();
    @Override
    public String create(AccountDto accountDto) {
        accounts.add(accountDto);
        return accounts.get(0).toString();
    }

    @Override
    public String get(Long id) {
        for (AccountDto a : accounts) {
            if (Objects.equals(a.getId(), id)) {
                return a.toString();
            }
        }

        return "No such account";
    }


}
