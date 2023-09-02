package com.example.finalproject.repository;

import com.example.finalproject.model.goal.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
    Goal findByName(String name);
}
