package com.example.finalproject.repository;

import com.example.finalproject.dto.BudgetDto;
import com.example.finalproject.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    Budget findByName(String name);
}
