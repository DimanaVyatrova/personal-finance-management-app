package com.example.finalproject.service;


import com.example.finalproject.model.Budget;
import com.example.finalproject.model.Category;
import com.example.finalproject.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    private final BudgetRepository budgetRepository;
    private final CategoryService categoryService;

    @Autowired
    public BudgetService(BudgetRepository budgetRepository, CategoryService categoryService) {
        this.budgetRepository = budgetRepository;
        this.categoryService = categoryService;
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
        System.out.println(getBudgetById(id));
        List<Category> allCategories = categoryService.getAllCategories();

        for (Category c : allCategories) {
            if (c.getBudget().getId().equals(id)) {
                categoryService.deleteCategoryById(c.getId());
            }
        }
        budgetRepository.deleteById(id);
    }
}