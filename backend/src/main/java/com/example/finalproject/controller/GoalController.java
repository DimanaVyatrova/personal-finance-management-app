package com.example.finalproject.controller;

import com.example.finalproject.dto.GoalDto;
import com.example.finalproject.mapper.GoalMapper;
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
    private UserService userService;
    private GoalMapper goalMapper;
    private GoalService goalService;

    @PostMapping()
    public void createGoal(@RequestBody GoalDto goalDto) {
        User user = userService.getUserById(goalDto.getUserId());
        goalService.create(goalMapper.toEntity(goalDto, user));

    }

    @GetMapping()
    public List<GoalDto> getGoals() {
        return goalService.getAllGoals().stream().map(goalMapper::toDto).toList();
    }

    @GetMapping("/name/{name}")
    public GoalDto getGoalByName(@PathVariable String name) {
        return goalMapper.toDto(goalService.getGoalByName(name));
    }

    @GetMapping("{id}")
    public GoalDto getGoalById(@PathVariable Long id) {
        return goalMapper.toDto(goalService.getGoalById(id));
    }

    @PutMapping()
    public void updateGoal(@RequestBody GoalDto goalDto) {
        User user = userService.getUserById(goalDto.getUserId());
        goalService.updateGoal(goalMapper.toEntity(goalDto, user));
    }

    @DeleteMapping("/name/{name}")
    public void deleteGoalByName(@PathVariable String name) {
        goalService.deleteGoalByName(name);
    }

}
