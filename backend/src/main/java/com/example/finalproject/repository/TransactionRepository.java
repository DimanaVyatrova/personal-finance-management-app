package com.example.finalproject.repository;

import com.example.finalproject.model.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByIdIn(List<Long> ids);

}
