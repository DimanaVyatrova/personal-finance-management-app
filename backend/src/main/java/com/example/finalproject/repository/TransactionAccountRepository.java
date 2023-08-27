package com.example.finalproject.repository;

import com.example.finalproject.model.transaction.TransactionAccount;
import com.example.finalproject.model.transaction.TransactionAccountKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionAccountRepository extends JpaRepository<TransactionAccount, TransactionAccountKey> {
}
