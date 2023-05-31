package com.example.finalproject.model.transaction;

import com.example.finalproject.model.accounts.Account;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;

@Data
@Entity
public class TransactionAccount {
    @EmbeddedId
    TransactionAccountKey id;

    @ManyToOne
    @MapsId("transactionId")
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    @ManyToOne
    @MapsId("accountId")
    @JoinColumn(name = "account_id")
    private Account account;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionType transactionType;
}
