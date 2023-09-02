package com.example.finalproject.model.transaction;

import com.example.finalproject.model.Category;
import com.example.finalproject.model.RecurringPeriod;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@Table(name="transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private LocalDate createdAt;

    @Column(nullable = false)
    private Long amount;

    @Column
    private String transactionParty;

    @OneToMany(mappedBy = "transaction")
    private Set<TransactionAccount> transactionAccounts;

    @Enumerated(EnumType.STRING)
    private RecurringPeriod period;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
