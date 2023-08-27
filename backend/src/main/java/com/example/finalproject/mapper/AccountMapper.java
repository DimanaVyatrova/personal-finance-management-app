package com.example.finalproject.mapper;

import com.example.finalproject.dto.AccountDto;
import com.example.finalproject.model.User;
import com.example.finalproject.model.accounts.Account;
import com.example.finalproject.model.accounts.CheckingAccount;
import com.example.finalproject.model.accounts.InvestmentAccount;
import com.example.finalproject.model.accounts.SavingsAccount;
import com.example.finalproject.service.AccountService;
import com.example.finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    private final UserService userService;
    private final AccountService accountService;

    @Autowired
    public AccountMapper(UserService userService, AccountService accountService) {
        this.userService = userService;
        this.accountService = accountService;
    }

    public Account toEntity(AccountDto accountDto) {
       if (accountDto.getType().equals("checking")) {
           CheckingAccount checkingAccount = new CheckingAccount();
           checkingAccount.setName(accountDto.getName());
           checkingAccount.setBalance(accountDto.getBalance());
           User user = userService.getUserByName(accountDto.getRelationName());
           checkingAccount.setUser(user);
           return checkingAccount;
       }
       else if (accountDto.getType().equals("saving")) {
           SavingsAccount savingsAccount = new SavingsAccount();
           savingsAccount.setName(accountDto.getName());
           savingsAccount.setBalance(accountDto.getBalance());
           savingsAccount.setCheckingAccount((CheckingAccount) accountService.getAccountByName(accountDto.getRelationName()));
           //savingsAccount.setGoal((SaveGoal) goalService.getGoalByName(accountDto.getGoalName()));
           return savingsAccount;
       }
       else { //investment
           InvestmentAccount investmentAccount = new InvestmentAccount();
           investmentAccount.setName(accountDto.getName());
           investmentAccount.setBalance(accountDto.getBalance());
           investmentAccount.setCheckingAccount((CheckingAccount) accountService.getAccountByName(accountDto.getRelationName()));
           return investmentAccount;
       }
    }

    public AccountDto toDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setBalance(account.getBalance());
        accountDto.setName(account.getName());

        if (account instanceof CheckingAccount) {
            accountDto.setType("checking");
            accountDto.setRelationName(((CheckingAccount) account).getUser().getUsername());
        }
        if (account instanceof SavingsAccount) {
            accountDto.setType("savings");
            accountDto.setRelationName(((SavingsAccount) account).getCheckingAccount().getName());
            accountDto.setRelationName(((SavingsAccount) account).getGoal().getName());
        }
        if (account instanceof InvestmentAccount) {
            accountDto.setType("investment");
            accountDto.setRelationName(((InvestmentAccount) account).getCheckingAccount().getName());
        }

        return accountDto;

    }
}
