package com.example.finalproject.model.accounts;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "investment_accounts")
@Data
@PrimaryKeyJoinColumn(name = "investmentAccountId")
public class InvestmentAccount extends Account {
    @ManyToOne
    @JoinColumn(name = "checking_account_id", nullable = false)
    private CheckingAccount checkingAccount;
}
