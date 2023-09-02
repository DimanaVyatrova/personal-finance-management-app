package com.example.finalproject.model.accounts;

import com.example.finalproject.model.transaction.TransactionAccount;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "accounts")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Double balance;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "account")
    private Set<TransactionAccount> transactionAccounts;
}
