package com.example.finalproject.mapper;

import com.example.finalproject.dto.GoalDto;
import com.example.finalproject.model.User;
import com.example.finalproject.model.goal.Goal;
import com.example.finalproject.model.goal.PayGoal;
import com.example.finalproject.model.goal.SaveGoal;
import org.springframework.stereotype.Component;


@Component
public class GoalMapper {

    public Goal toEntity(GoalDto dto, User user) {
        if (dto.getGoalType().equals("PAY")) {
            PayGoal payGoal = new PayGoal();
            payGoal.setUser(user);
            payGoal.setName(dto.getName());
            payGoal.setGoalAmount(dto.getGoalAmount());
            payGoal.setCurrentAmount(dto.getCurrentAmount());
            payGoal.setPayee(dto.getPayee());

            return payGoal;
        }
        else {
            SaveGoal saveGoal = new SaveGoal();
            saveGoal.setUser(user);
            saveGoal.setName(dto.getName());
            saveGoal.setGoalAmount(dto.getGoalAmount());
            saveGoal.setCurrentAmount(dto.getCurrentAmount());
            return saveGoal;
        }
    }

    public GoalDto toDto(Goal goal) {
        GoalDto goalDto = new GoalDto();
        if (goal instanceof PayGoal) {
            goalDto.setGoalType("PAY");
            goalDto.setName(goal.getName());
            goalDto.setGoalAmount(goal.getGoalAmount());
            goalDto.setCurrentAmount(goal.getCurrentAmount());
            goalDto.setUserId(goal.getUser().getId());
            goalDto.setPayee(((PayGoal) goal).getPayee());
            //goalDto.setSavingsAccountId(null);
        }

        if (goal instanceof SaveGoal) {
            goalDto.setGoalType("SAVE");
            goalDto.setName(goal.getName());
            goalDto.setGoalAmount(goal.getGoalAmount());
            goalDto.setCurrentAmount(goal.getCurrentAmount());
            goalDto.setUserId(goal.getUser().getId());
            goalDto.setPayee(null);
            //goalDto.setSavingsAccountId(((SaveGoal) goal).getSavingsAccount().getId());
        }

        return goalDto;
    }
}
