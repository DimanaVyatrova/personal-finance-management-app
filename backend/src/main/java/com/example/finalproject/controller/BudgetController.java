package com.example.finalproject.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("budgets")
public class BudgetController {
    @GetMapping()
    public String getBudgets() {
        return null;
    }

    @GetMapping("{id}")
    public String getBudgetById(@PathVariable Long id) {
        return null;
    }

    @PostMapping()
    public String createBudget() {
        return null;
    }
}
