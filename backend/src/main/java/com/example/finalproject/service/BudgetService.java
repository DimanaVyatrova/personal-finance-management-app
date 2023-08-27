package com.example.finalproject.service;


import com.example.finalproject.model.Budget;
import com.example.finalproject.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    private final BudgetRepository budgetRepository;

    @Autowired
    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }
    public void create(Budget budget) {
        budgetRepository.save(budget);
    }

    public Budget getBudgetById(Long id) {
        return budgetRepository.findById(id).get();
    }

    public Budget getBudgetByName(String name) {
        return budgetRepository.findByName(name);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public void updateBudget(Budget budget) {
        budget.setId(getBudgetByName(budget.getName()).getId());
        budgetRepository.save(budget);
    }

    public void deleteBudget(Long id) {
        budgetRepository.deleteById(id);
    }
}