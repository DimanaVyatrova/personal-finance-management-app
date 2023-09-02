package com.example.finalproject.model.accounts;

import com.example.finalproject.model.goal.SaveGoal;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "savings_accounts")
@Data
@PrimaryKeyJoinColumn(name = "savingsAccountId")
public class SavingsAccount extends Account {
    @ManyToOne
    @JoinColumn(name = "checking_account_id", nullable = false)
    private CheckingAccount checkingAccount;

    //@OneToOne(mappedBy = "savingsAccount")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "goal_id")
    private SaveGoal goal;
}
