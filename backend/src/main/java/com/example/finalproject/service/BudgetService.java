package com.example.finalproject.service;

import com.example.finalproject.dto.BudgetDto;
import com.example.finalproject.mapper.BudgetMapper;
import com.example.finalproject.model.Budget;
import com.example.finalproject.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    @Autowired
    BudgetRepository budgetRepository;

    @Autowired
    BudgetMapper budgetMapper;

    public void create(Budget budget) {
        budgetRepository.save(budget);
    }

    public BudgetDto getBudgetById(Long id) {
        return budgetMapper.toDto(budgetRepository.findById(id).get());
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