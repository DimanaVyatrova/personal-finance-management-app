package com.example.finalproject.mapper;

import com.example.finalproject.dto.BudgetDto;
import com.example.finalproject.model.Budget;
import com.example.finalproject.model.RecurringPeriod;
import com.example.finalproject.model.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BudgetMapper {
    public Budget toEntity(BudgetDto dto, User user) {
        RecurringPeriod recurringPeriod = null;
        if (dto.getReccuringPeriod().equals("monthly")) {
            recurringPeriod = RecurringPeriod.MONTHLY;
        }
        if (dto.getReccuringPeriod().equals("annualy")) {
            recurringPeriod = RecurringPeriod.ANNUALLY;
        }
        if (dto.getReccuringPeriod().equals("weekly")) {
            recurringPeriod = RecurringPeriod.WEEKLY;
        }
        if (dto.getReccuringPeriod().equals("quaterly")) {
            recurringPeriod = RecurringPeriod.QUARTERLY;
        }
        return Budget.builder()
                .id(dto.getId())
                .user(user)
                .currentAmount(dto.getCurrentAmount())
                .limitAmount(dto.getLimitAmount())
                .name(dto.getName())
                .periodEnd(LocalDate.parse(dto.getPeriodEnd()))
                .periodStart(LocalDate.parse(dto.getPeriodStart()))
                .recurringPeriod(recurringPeriod)
                .build();
    }
}
