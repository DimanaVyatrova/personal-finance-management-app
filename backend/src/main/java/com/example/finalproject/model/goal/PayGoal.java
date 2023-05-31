package com.example.finalproject.model.goal;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("Pay")
@Data
public class PayGoal extends Goal {

    @Column
    private String payee;
}
