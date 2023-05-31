package com.example.finalproject.service;

import com.example.finalproject.dto.BudgetDto;
import com.example.finalproject.model.Budget;
import com.example.finalproject.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {

    @Autowired
    BudgetRepository budgetRepository;

    public void create(Budget budget) {
        budgetRepository.save(budget);
    }

    /*public String getBudgetById(Long id) {
        return budgetRepository.getBudgetById(id);
    }

    public String getAllBudgets() {
        return budgetRepository.getAllBudgets();
    }*/
}