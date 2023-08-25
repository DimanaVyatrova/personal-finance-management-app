package com.example.finalproject.controller;

import com.example.finalproject.dto.BudgetDto;
import com.example.finalproject.dto.GoalDto;
import com.example.finalproject.mapper.GoalMapper;
import com.example.finalproject.model.Category;
import com.example.finalproject.model.User;
import com.example.finalproject.service.GoalService;
import com.example.finalproject.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("goals")
public class GoalController {
    UserService userService;
    GoalMapper goalMapper;
    GoalService goalService;

    @PostMapping()
    public void createGoal(@RequestBody GoalDto goalDto) {
        //System.out.println("This is get user id : " + budgetDto.getCurrentAmount());
        User user = userService.getUserById(goalDto.getUserId());
        //userService.getUserById(budgetDto.getUserId()).getBudgets().add(mapper.toEntity(budgetDto, user));
        goalService.create(goalMapper.toEntity(goalDto, user));

    }

    @GetMapping()
    public List<GoalDto> getGoals() {
        return goalService.getAllGoals();
    }

    @GetMapping("{name}")
    public GoalDto getGoalByName(@PathVariable String name) {
        return goalMapper.toDto(goalService.getGoalByName(name));
    }

    @DeleteMapping("{name}")
    public void deleteGoalByName(@PathVariable String name) {
        goalService.deleteGoalByName(name);
    }

}
