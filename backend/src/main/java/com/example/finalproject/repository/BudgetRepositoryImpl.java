package com.example.finalproject.repository;

import com.example.finalproject.dto.BudgetDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*@Repository
public class BudgetRepositoryImpl implements BudgetRepository {
    private List<BudgetDto> budgets = new ArrayList<>();

    @Override
    public String create(BudgetDto budgetDto) {
        budgets.add(budgetDto);
        return budgetDto.toString();
    }

    @Override
    public String getAllBudgets() {
        String result = "";

        for(BudgetDto b : budgets) {
            result += b.toString() + System.lineSeparator();
        }

        return result;
    }

    @Override
    public String getBudgetById(Long id) {
        for (BudgetDto b : budgets) {
            if (b.getId().equals(id)) {
                return b.toString();
            }
        }
        return "No budget with such id";
    }
}*/
