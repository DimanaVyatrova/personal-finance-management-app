package com.example.finalproject.service;


import com.example.finalproject.model.accounts.SavingsAccount;
import com.example.finalproject.model.goal.Goal;
import com.example.finalproject.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {
    private final GoalRepository goalRepository;

    @Autowired
    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public void create(Goal goal) {
        goalRepository.save(goal);
    }

    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    public Goal getGoalByName(String name) {
        return goalRepository.findByName(name);
    }

    public Goal getGoalById(Long id) {
        return goalRepository.findById(id).get();
    }

    public void updateGoal(Goal goal) {
        goal.setId(getGoalByName(goal.getName()).getId());
        goalRepository.save(goal);
    }

    public void deleteGoalByName(String name) {
        goalRepository.deleteById(getGoalByName(name).getId());
    }
}
