package com.example.finalproject.model.accounts;

import com.example.finalproject.model.goal.SaveGoal;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "savings_accounts")
@Data
@PrimaryKeyJoinColumn(name = "savingsAccountId")
public class SavingsAccount extends Account {
    @ManyToOne
    @JoinColumn(name = "checking_account_id", nullable = false)
    private CheckingAccount checkingAccount;

    @OneToOne(mappedBy = "savingsAccount")
    private SaveGoal goal;
}
