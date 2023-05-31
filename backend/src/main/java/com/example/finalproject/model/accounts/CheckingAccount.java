package com.example.finalproject.model.accounts;

import com.example.finalproject.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "checking_accounts")
@Data
@PrimaryKeyJoinColumn(name = "checkingAccountId")
public class CheckingAccount extends Account {
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "checkingAccount")
    private Set<SavingsAccount> savingsAccounts;

    @OneToMany(mappedBy = "checkingAccount")
    private Set<InvestmentAccount> investmentAccounts;
}
