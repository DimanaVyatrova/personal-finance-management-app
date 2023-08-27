package com.example.finalproject.service;

import com.example.finalproject.model.accounts.Account;
import com.example.finalproject.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void create(Account account) {
        accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return  accountRepository.findAll();
    }

    public Account getAccountByName(String name) {
        return accountRepository.findByName(name);
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).get();
    }

    public void updateAccount(Account account) {
        account.setId(getAccountByName(account.getName()).getId());
        accountRepository.save(account);
    }

    public void deleteAccountById(Long id) {
        accountRepository.deleteById(id);
    }

}
