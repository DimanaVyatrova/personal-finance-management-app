package com.example.finalproject.repository;

import com.example.finalproject.model.transaction.TransactionAccount;
import com.example.finalproject.model.transaction.TransactionAccountKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionAccountRepository extends JpaRepository<TransactionAccount, TransactionAccountKey> {
    List<Long> findAllByAccountIdIs(Long accountId);
}
