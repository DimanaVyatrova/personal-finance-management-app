package com.example.finalproject.repository;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.model.accounts.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Account findByName(String name);
}
