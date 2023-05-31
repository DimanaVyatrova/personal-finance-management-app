package com.example.finalproject.model.goal;

import com.example.finalproject.model.vaults.SavingsVault;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "savingsVault_id")
    private SavingsVault savingsVault;
}
