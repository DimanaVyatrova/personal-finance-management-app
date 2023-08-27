package com.example.finalproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class BudgetDto {
    //private Long id;
    private Double currentAmount;
    private Double limitAmount;
    private String name;
    private String periodEnd;
    private String periodStart;
    private String reccuringPeriod;
    private Long userId;
    private List<String> categories;
}
