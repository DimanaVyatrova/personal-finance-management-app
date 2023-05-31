package com.example.finalproject.controller;

import com.example.finalproject.dto.BudgetDto;
import com.example.finalproject.mapper.BudgetMapper;
import com.example.finalproject.model.Budget;
import com.example.finalproject.model.User;
import com.example.finalproject.service.BudgetService;
import com.example.finalproject.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("budgets")
public class BudgetController {
    BudgetMapper mapper;

    UserService userService;
    BudgetService budgetService;

    /*@GetMapping()
    public String getBudgets() {
        return budgetService.getAllBudgets();
    }

    @GetMapping("{id}")
    public String getBudgetsById(@PathVariable Long id) {
        return budgetService.getBudgetById(id);
    }*/

    @PostMapping()
    public void createBudget(@RequestBody BudgetDto budgetDto) {
        System.out.println("This is get user id : " + budgetDto.getCurrentAmount());
        User user = userService.getUserById(budgetDto.getUserId());
        //userService.getUserById(budgetDto.getUserId()).getBudgets().add(mapper.toEntity(budgetDto, user));
        budgetService.create(mapper.toEntity(budgetDto, user));
    }
}
