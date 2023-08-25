package com.example.finalproject.service;

import com.example.finalproject.dto.GoalDto;
import com.example.finalproject.mapper.GoalMapper;
import com.example.finalproject.model.Budget;
import com.example.finalproject.model.goal.Goal;
import com.example.finalproject.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {
    @Autowired
    GoalRepository goalRepository;
    @Autowired
    GoalMapper goalMapper;

    public void create(Goal goal) {
        goalRepository.save(goal);
    }

    public List<GoalDto> getAllGoals() {
        return goalRepository.findAll().stream().map(goalMapper::toDto).toList();
    }

    public Goal getGoalByName(String name) {
        return goalRepository.findByName(name);
    }

    public void deleteGoalByName(String name) {
        goalRepository.deleteById(getGoalByName(name).getId());
    }
}
