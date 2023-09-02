package com.example.finalproject.model.goal;

import com.example.finalproject.model.accounts.SavingsAccount;
import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@DiscriminatorValue("SAVE")
@Data
public class SaveGoal extends Goal {

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "savingsAccount_id")
    @OneToOne(mappedBy = "goal")
    private SavingsAccount savingsAccount;
}
