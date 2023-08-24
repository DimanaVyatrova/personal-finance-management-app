package com.example.finalproject.repository;

import com.example.finalproject.dto.AccountDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository{
    public String create(AccountDto accountDto);
}
