package com.example.finalproject.model.vaults;

import com.example.finalproject.model.goal.SaveGoal;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class SavingsVault extends Vault {

    @OneToOne(mappedBy = "savingsVault")
    private SaveGoal goal;
}
