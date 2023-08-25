package com.example.finalproject.controller;

import com.example.finalproject.dto.BudgetDto;
import com.example.finalproject.mapper.BudgetMapper;
import com.example.finalproject.model.Budget;
import com.example.finalproject.model.Category;
import com.example.finalproject.model.User;
import com.example.finalproject.service.BudgetService;
import com.example.finalproject.service.CategoryService;
import com.example.finalproject.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("budgets")
public class BudgetController {
    BudgetMapper mapper;
    UserService userService;
    BudgetService budgetService;
    CategoryService categoryService;

    @GetMapping()
    public List<BudgetDto> getBudgets() {
        return budgetService.getAllBudgets();
    }

    @GetMapping("{id}")
    public BudgetDto getBudgetsById(@PathVariable Long id) {
        return budgetService.getBudgetById(id);
    }

    @PostMapping()
    public void createBudget(@RequestBody BudgetDto budgetDto) {
        System.out.println("This is get user id : " + budgetDto.getCurrentAmount());
        User user = userService.getUserById(budgetDto.getUserId());
        //userService.getUserById(budgetDto.getUserId()).getBudgets().add(mapper.toEntity(budgetDto, user));
        budgetService.create(mapper.toEntity(budgetDto, user));
        for (String category : budgetDto.getCategories()) {
            Category category1 = new Category();
            category1.setName(category);
            category1.setBudget(mapper.toEntity(budgetDto, user));
            categoryService.createCategory(category1);
        }
    }

    @DeleteMapping("{id}")
    public void deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
    }
}
